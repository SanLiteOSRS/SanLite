import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class270 {
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)Lkk;",
      garbageValue = "-1980425423"
   )
   @Export("valueOf")
   public static class309 valueOf(int var0) {
      class309[] var1 = AbstractSocket.method5702();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class309 var3 = var1[var2];
         if (var0 == var3.field3791) {
            return var3;
         }
      }

      return null;
   }
}
