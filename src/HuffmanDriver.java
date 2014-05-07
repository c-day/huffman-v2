import java.util.Hashtable;



public class HuffmanDriver {

	public static void main(String[] args) {
		
		Huffman huf = new Huffman("lyricdata");
		
		SubGenre bluegrass = huf.genres.get(0).subgenres.get(0);
		
		System.out.println("\nBuilding word count for all artists");
		huf.countSubs();
		System.out.println("Words have been counted!\n");
		
		System.out.println("\nBuilding the tree");
		HuffmanTree tree = huf.buildTree(bluegrass);
		System.out.println("Tree built!\n");
		
		System.out.println("Encoding Words...");
		Hashtable<String, String> encodedHash = huf.encodeWords(tree, new StringBuffer());
		System.out.println("Successfully Encoded!\n");
		
		try {
			System.out.println("huffcount = " + huf.huffCount(bluegrass, encodedHash));
			System.out.println("blockcount = " + huf.blockCount(bluegrass, encodedHash));
			System.out.println("ratio = " + ((double)(huf.huffCount(bluegrass, encodedHash) / (double)huf.blockCount(bluegrass, encodedHash))));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
