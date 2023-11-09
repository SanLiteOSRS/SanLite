import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("ay")
	final int field5054;
	@ObfuscatedName("an")
	final int field5023;
	@ObfuscatedName("ar")
	final int field5024;
	@ObfuscatedName("ab")
	final int field5025;
	@ObfuscatedName("at")
	final int field5026;
	@ObfuscatedName("ax")
	final int field5027;
	@ObfuscatedName("al")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -805273921
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1976415787
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ag")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1263400625
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 808543129
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 654995741
	)
	int field5036;
	@ObfuscatedName("ah")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1733078645
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1308279445
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -581882447
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -620442624
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1743905617
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1256967331
	)
	int field5041;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1494925369
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("az")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -194316527
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("aa")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1657814727
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bp")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bw")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bq")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bi")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bg")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bh")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bc")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bo")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("be")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bv")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bl")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bs")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -377817899
	)
	int field5056;

	BZip2State() {
		this.field5054 = 4096; // L: 4
		this.field5023 = 16; // L: 5
		this.field5024 = 258; // L: 6
		this.field5025 = 6; // L: 7
		this.field5026 = 50; // L: 8
		this.field5027 = 18002; // L: 9
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
