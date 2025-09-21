import java.util.*;

class MovieRentingSystem {
    private static final Comparator<long[]> BY_PRICE_SHOP =
        (a, b) -> a[0] != b[0] ? Long.compare(a[0], b[0]) : Long.compare(a[1], b[1]);
    private static final Comparator<long[]> BY_PRICE_SHOP_MOVIE =
        (a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            if (a[1] != b[1]) return Long.compare(a[1], b[1]);
            return Long.compare(a[2], b[2]);
        };

    private final Map<Long, Integer> price = new HashMap<>();
    private final Map<Integer, TreeSet<long[]>> available = new HashMap<>();
    private final TreeSet<long[]> rented = new TreeSet<>(BY_PRICE_SHOP_MOVIE);

    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] e : entries) {
            int shop = e[0], movie = e[1], p = e[2];
            price.put(key(shop, movie), p);
            available.computeIfAbsent(movie, k -> new TreeSet<>(BY_PRICE_SHOP))
                     .add(new long[]{p, shop});
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> ans = new ArrayList<>();
        TreeSet<long[]> set = available.get(movie);
        if (set == null) return ans;
        Iterator<long[]> it = set.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) ans.add((int) it.next()[1]);
        return ans;
    }

    public void rent(int shop, int movie) {
        int p = price.get(key(shop, movie));
        TreeSet<long[]> set = available.get(movie);
        if (set != null) set.remove(new long[]{p, shop});
        rented.add(new long[]{p, shop, movie});
    }

    public void drop(int shop, int movie) {
        int p = price.get(key(shop, movie));
        rented.remove(new long[]{p, shop, movie});
        available.computeIfAbsent(movie, k -> new TreeSet<>(BY_PRICE_SHOP))
                 .add(new long[]{p, shop});
    }

    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<long[]> it = rented.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            long[] r = it.next();
            ans.add(Arrays.asList((int) r[1], (int) r[2]));
        }
        return ans;
    }

    private long key(int s, int m) {
        return (((long) s) << 32) ^ (m & 0xffffffffL);
    }
}