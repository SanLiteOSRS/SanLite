import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("f")
	final int field4948;
	@ObfuscatedName("w")
	final int field4946;
	@ObfuscatedName("v")
	final int field4947;
	@ObfuscatedName("s")
	final int field4976;
	@ObfuscatedName("z")
	final int field4949;
	@ObfuscatedName("j")
	final int field4967;
	@ObfuscatedName("i")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1271568777
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -175638631
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("k")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1979788995
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1615110047
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1445321817
	)
	int field4957;
	@ObfuscatedName("m")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -562478711
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 520529197
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1266025893
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1685214208
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 301132855
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1436423459
	)
	int field4964;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1684073131
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("q")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 310629595
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("e")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 941465473
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("af")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("aa")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ai")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ag")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aw")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ar")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("al")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("at")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("aj")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ax")
	@Export("base")
	int[][] base;
	@ObfuscatedName("az")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ap")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1984167077
	)
	int field4982;

	BZip2State() {
		this.field4948 = 4096; // L: 4
		this.field4946 = 16; // L: 5
		this.field4947 = 258; // L: 6
		this.field4976 = 6; // L: 7
		this.field4949 = 50; // L: 8
		this.field4967 = 18002; // L: 9
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lln;III)Lrs;",
		garbageValue = "-126642203"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Buffer.method8892(var0, var1, var2)) { // L: 47
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 50
			var4.width = class488.SpriteBuffer_spriteWidth; // L: 51
			var4.height = class488.SpriteBuffer_spriteHeight; // L: 52
			var4.xOffset = class488.SpriteBuffer_xOffsets[0]; // L: 53
			var4.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[0]; // L: 54
			var4.subWidth = FriendsList.SpriteBuffer_spriteWidths[0]; // L: 55
			var4.subHeight = class132.SpriteBuffer_spriteHeights[0]; // L: 56
			int var5 = var4.subWidth * var4.subHeight; // L: 57
			byte[] var6 = class140.SpriteBuffer_pixels[0]; // L: 58
			var4.pixels = new int[var5]; // L: 59

			for (int var7 = 0; var7 < var5; ++var7) { // L: 60
				var4.pixels[var7] = class100.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class100.method2724(); // L: 61
			return var4; // L: 64
		}
	}
}
