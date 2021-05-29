import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nh")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("v")
	final int field4171;
	@ObfuscatedName("n")
	final int field4161;
	@ObfuscatedName("f")
	final int field4162;
	@ObfuscatedName("y")
	final int field4186;
	@ObfuscatedName("p")
	final int field4164;
	@ObfuscatedName("j")
	final int field4165;
	@ObfuscatedName("r")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1851391215
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1612509485
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("s")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1856584985
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -795709793
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -743824809
	)
	int field4177;
	@ObfuscatedName("c")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1772899085
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -492240629
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1723069525
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -235650048
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1146975777
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1768365777
	)
	int field4195;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2146251751
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("w")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -985271003
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("h")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -846985049
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ae")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ap")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ab")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("al")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ad")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ai")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ar")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ag")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ax")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("as")
	@Export("base")
	int[][] base;
	@ObfuscatedName("aj")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("am")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 375128139
	)
	int field4174;

	BZip2State() {
		this.field4171 = 4096;
		this.field4161 = 16;
		this.field4162 = 258;
		this.field4186 = 6;
		this.field4164 = 50;
		this.field4165 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
