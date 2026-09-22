ArrayList<Integer> ref2 = new ArrayList<>();

       for (int i = pos; i < prices.length; i++) {
            ref2.add(prices[i]);
        }

        Collections.sort(ref2);

        int largest = ref2.get(ref2.size()-1);

        return largest - smallest;
    }
        //setup a ref2 to help get values and pos and sorted


}