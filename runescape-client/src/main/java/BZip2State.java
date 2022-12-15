import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rf")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("z")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("h")
	final int field4954;
	@ObfuscatedName("e")
	final int field4925;
	@ObfuscatedName("v")
	final int field4923;
	@ObfuscatedName("x")
	final int field4949;
	@ObfuscatedName("m")
	final int field4924;
	@ObfuscatedName("q")
	final int field4926;
	@ObfuscatedName("f")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1821114693
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1658409903
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("b")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1295462847
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1101177005
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -825545807
	)
	int field4936;
	@ObfuscatedName("o")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -57104711
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1388160973
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2006172181
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 571376640
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1238646899
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 935146643
	)
	int field4940;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -633335589
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("p")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -287672173
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("y")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -50977887
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("as")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ad")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("am")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("av")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("au")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ar")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("at")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ay")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("an")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ab")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("al")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -290046001
	)
	int field4959;

	BZip2State() {
		this.field4954 = 4096; // L: 4
		this.field4925 = 16; // L: 5
		this.field4923 = 258; // L: 6
		this.field4949 = 6; // L: 7
		this.field4924 = 50; // L: 8
		this.field4926 = 18002; // L: 9
		this.nextByte = 0; // L: 11
		this.next_out = 0; // L: 14
		this.unzftab = new int[256]; // L: 25
		this.cftab = new int[257]; // L: 27
		this.inUse = new boolean[256]; // L: 30
		this.inUse16 = new boolean[16]; // L: 31
		this.seqToUnseq = new byte[256]; // L: 32
		this.ll8 = new byte[4096]; // L: 33
		this.getAndMoveToFrontDecode_yy = new int[16]; // L: 34
		this.selector = new byte[18002]; // L: 35
		this.selectorMtf = new byte[18002]; // L: 36
		this.temp_charArray2d = new byte[6][258]; // L: 37
		this.limit = new int[6][258]; // L: 38
		this.base = new int[6][258]; // L: 39
		this.perm = new int[6][258]; // L: 40
		this.minLens = new int[6]; // L: 41
	} // L: 44
}
