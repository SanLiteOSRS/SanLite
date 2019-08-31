import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("VertexNormal")
public class VertexNormal {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1795200651
   )
   int field1737;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1592235953
   )
   int field1735;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 221616325
   )
   int field1736;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1908751547
   )
   int field1734;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      signature = "(Ldl;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.field1737 = var1.field1737;
      this.field1735 = var1.field1735;
      this.field1736 = var1.field1736;
      this.field1734 = var1.field1734;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lhz;Ljava/lang/String;Ljava/lang/String;S)Llq;",
      garbageValue = "3108"
   )
   @Export("SpriteBuffer_getIndexedSpriteByName")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      return Clock.SpriteBuffer_getIndexedSprite(var0, var3, var4);
   }
}
