import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("sr")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   @Export("worldMap")
   static WorldMap worldMap;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   public static final WorldMapCacheName field295 = new WorldMapCacheName("details");
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   public static final WorldMapCacheName field290 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   public static final WorldMapCacheName field291 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   static final WorldMapCacheName field292 = new WorldMapCacheName("area");
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   public static final WorldMapCacheName field293 = new WorldMapCacheName("labels");
   @ObfuscatedName("n")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "40"
   )
   static void method593() {
      PacketBufferNode var0 = MenuAction.method1994(ClientPacket.field2220, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(UserComparator7.getWindowedMode());
      var0.packetBuffer.writeShort(KitDefinition.canvasWidth);
      var0.packetBuffer.writeShort(class30.canvasHeight);
      Client.packetWriter.method2177(var0);
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "350490543"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (Client.clanChat != null) {
         PacketBufferNode var1 = MenuAction.method1994(ClientPacket.field2198, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(Buddy.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.method2177(var1);
      }
   }
}
