import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ta")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("at")
	final int field5058;
	@ObfuscatedName("an")
	final int field5027;
	@ObfuscatedName("av")
	final int field5028;
	@ObfuscatedName("as")
	final int field5029;
	@ObfuscatedName("ax")
	final int field5057;
	@ObfuscatedName("ap")
	final int field5031;
	@ObfuscatedName("ab")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1904713285
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -757246445
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("af")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2072347971
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 386315705
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1794913673
	)
	int field5060;
	@ObfuscatedName("ad")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1641416731
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1202899389
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1915000559
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1893250048
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1671701129
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 563051131
	)
	int field5045;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -830789181
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aq")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -217680743
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ay")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1414409225
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bs")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bc")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bj")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bo")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bg")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bf")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bd")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ba")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bn")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bb")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bx")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1266130793
	)
	int field5063;

	BZip2State() {
		this.field5058 = 4096; // L: 4
		this.field5027 = 16; // L: 5
		this.field5028 = 258; // L: 6
		this.field5029 = 6; // L: 7
		this.field5057 = 50; // L: 8
		this.field5031 = 18002; // L: 9
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
