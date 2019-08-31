import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class173 {
   @ObfuscatedName("i")
   @Export("directions")
   public static int[][] directions = new int[128][128];
   @ObfuscatedName("k")
   @Export("distances")
   public static int[][] distances = new int[128][128];
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1891183659
   )
   public static int field2073;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 783444493
   )
   public static int field2070;
   @ObfuscatedName("q")
   @Export("bufferX")
   public static int[] bufferX = new int[4096];
   @ObfuscatedName("x")
   @Export("bufferY")
   public static int[] bufferY = new int[4096];
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1559987227
   )
   static int field2079;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-146894719"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (IgnoreList.field3576 == null) {
            IgnoreList.field3576 = ScriptEvent.urlRequester.request(new URL(class1.field6));
         } else if (IgnoreList.field3576.isDone()) {
            byte[] var0 = IgnoreList.field3576.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.worldsCount = var1.readUnsignedShort();
            ChatChannel.worlds = new World[World.worldsCount];

            World var3;
            for(int var2 = 0; var2 < World.worldsCount; var3.index = var2++) {
               var3 = ChatChannel.worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            Tile.sortWorlds(ChatChannel.worlds, 0, ChatChannel.worlds.length - 1, World.sortOption1, World.sortOption2);
            IgnoreList.field3576 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         IgnoreList.field3576 = null;
      }

      return false;
   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      signature = "(Lhp;I)Ljava/lang/String;",
      garbageValue = "1595503156"
   )
   static String method3529(Widget var0) {
      if (WorldMapRegion.method530(ParamDefinition.getWidgetClickMask(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
