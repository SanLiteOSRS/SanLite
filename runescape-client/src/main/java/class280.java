import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class280 {
	@ObfuscatedName("i")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -2114671873
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-6"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			WorldMapData_0.method3145(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1196 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "64684553"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class25.clanChat != null) {
			PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2621, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
