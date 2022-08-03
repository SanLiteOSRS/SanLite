import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qd")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("o")
	final int field4729;
	@ObfuscatedName("q")
	final int field4715;
	@ObfuscatedName("f")
	final int field4716;
	@ObfuscatedName("u")
	final int field4717;
	@ObfuscatedName("c")
	final int field4718;
	@ObfuscatedName("w")
	final int field4719;
	@ObfuscatedName("z")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1061882633
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1241744169
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("a")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -268992773
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 379275819
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1599277733
	)
	int field4741;
	@ObfuscatedName("g")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1618822425
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 116985793
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1622362317
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1973306368
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -421179221
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1872250707
	)
	int field4751;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -336985683
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("e")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1246519951
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("i")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1436981817
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ar")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("aj")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("au")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("af")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("as")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ab")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("al")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ah")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ai")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ac")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ap")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1469727093
	)
	int field4726;

	BZip2State() {
		this.field4729 = 4096; // L: 4
		this.field4715 = 16; // L: 5
		this.field4716 = 258; // L: 6
		this.field4717 = 6; // L: 7
		this.field4718 = 50; // L: 8
		this.field4719 = 18002; // L: 9
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
