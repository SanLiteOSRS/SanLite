import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("FaceNormal")
public class FaceNormal {
   @ObfuscatedName("x")
   @Export("ByteArrayPool_arrays")
   public static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 672881507
   )
   int field1865;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1754026933
   )
   int field1863;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -2141931209
   )
   int field1864;

   FaceNormal() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "-36"
   )
   static final boolean method3222(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method3219(CharSequence var0) {
      long var3 = 0L;
      int var5 = var0.length();

      for(int var6 = 0; var6 < var5; ++var6) {
         var3 *= 37L;
         char var7 = var0.charAt(var6);
         if (var7 >= 'A' && var7 <= 'Z') {
            var3 += (long)(var7 + 1 - 65);
         } else if (var7 >= 'a' && var7 <= 'z') {
            var3 += (long)(var7 + 1 - 97);
         } else if (var7 >= '0' && var7 <= '9') {
            var3 += (long)(var7 + 27 - 48);
         }

         if (var3 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var3 % 37L && var3 != 0L) {
         var3 /= 37L;
      }

      String var8 = class266.method4892(var3);
      if (var8 == null) {
         var8 = "";
      }

      return var8;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "105"
   )
   static int method3220(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
      }
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1280047556"
   )
   static final void method3221() {
      Client.field817 = Client.cycleCntr;
      class13.field84 = true;
   }
}
