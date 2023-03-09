import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ss")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("aj")
	final int field4935;
	@ObfuscatedName("al")
	final int field4938;
	@ObfuscatedName("ac")
	final int field4911;
	@ObfuscatedName("ab")
	final int field4940;
	@ObfuscatedName("an")
	final int field4934;
	@ObfuscatedName("ao")
	final int field4914;
	@ObfuscatedName("av")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -811441901
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -877546793
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ar")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 290672311
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -158025889
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1748047551
	)
	int field4921;
	@ObfuscatedName("ay")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2050824283
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -255173437
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 661581013
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 64398336
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1639419667
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -23106095
	)
	int field4928;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1890936445
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ai")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 159429297
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("aa")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1848953013
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bm")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bv")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bo")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bs")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bg")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bh")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bl")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bk")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("br")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ba")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bz")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bq")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -600141465
	)
	int field4946;

	BZip2State() {
		this.field4935 = 4096; // L: 4
		this.field4938 = 16; // L: 5
		this.field4911 = 258; // L: 6
		this.field4940 = 6; // L: 7
		this.field4934 = 50; // L: 8
		this.field4914 = 18002; // L: 9
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
