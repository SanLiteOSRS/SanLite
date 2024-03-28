import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uq")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("az")
	final int field5266;
	@ObfuscatedName("ah")
	final int field5240;
	@ObfuscatedName("af")
	final int field5276;
	@ObfuscatedName("at")
	final int field5243;
	@ObfuscatedName("an")
	final int field5241;
	@ObfuscatedName("ao")
	final int field5244;
	@ObfuscatedName("ab")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1417067089
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 230576689
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("al")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1211497623
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1299728931
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1603648775
	)
	int field5251;
	@ObfuscatedName("ax")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 105983993
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 935508407
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1667311657
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -26670080
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1023673873
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 818918681
	)
	int field5270;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 26857557
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aq")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2084389367
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ac")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1860465217
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bp")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bz")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bc")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bf")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("be")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bn")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bd")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bo")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bx")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bl")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bh")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bs")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1832664241
	)
	int field5246;

	BZip2State() {
		this.field5266 = 4096; // L: 4
		this.field5240 = 16; // L: 5
		this.field5276 = 258; // L: 6
		this.field5243 = 6; // L: 7
		this.field5241 = 50; // L: 8
		this.field5244 = 18002; // L: 9
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
