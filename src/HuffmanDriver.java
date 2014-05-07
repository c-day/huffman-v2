
public class HuffmanDriver {

	public static void main(String[] args) {
		Huffman huf = new Huffman("lyricdata");
		
		System.out.println("\nBuilding word count for all artists");
		huf.countSubs();
		System.out.println("Words have been counted!\n");
		
		System.out.println("\nBuilding the tree");
		HuffmanTree tree = huf.buildTree(huf.genres.get(0).subgenres.get(0)); //Country, Bluegrass
		System.out.println("Tree built!\n");
		
		System.out.println("Encoding Words...");
		huf.encodeWords(tree, new StringBuffer());
		System.out.println("Successfully Encoded!\n");
	}
}
