import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("s")
   final int field3737 = 4096;
   @ObfuscatedName("j")
   final int field3745 = 16;
   @ObfuscatedName("i")
   final int field3746 = 258;
   @ObfuscatedName("k")
   final int field3722 = 6;
   @ObfuscatedName("u")
   final int field3735 = 50;
   @ObfuscatedName("n")
   final int field3717 = 18002;
   @ObfuscatedName("t")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1249128023
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -423174679
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("d")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1450954735
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 875649401
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1562015159
   )
   int field3721;
   @ObfuscatedName("y")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1013295897
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2065373853
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -322433333
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1084513280
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1304598549
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 293823581
   )
   int field3736;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -545729875
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("l")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1751111105
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("v")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 463275141
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("av")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("am")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("ai")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("af")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("az")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("aj")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("an")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("at")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("as")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("ak")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("ao")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("ac")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -716853171
   )
   int field3754;

   BZip2State() {
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-3321312"
   )
   static int method5664(int var0) {
      return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
   }
}
