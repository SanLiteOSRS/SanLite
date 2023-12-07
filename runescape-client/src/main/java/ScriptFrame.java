import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1780121491
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 2104508416
	)
	static int field456;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 640777695
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ar")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ao")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1468769999"
	)
	static final void method1213(String var0) {
		PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 181
		var1.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0)); // L: 182
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 183
		Client.packetWriter.addNode(var1); // L: 184
	} // L: 185

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "128237974"
	)
	static final void method1212(PendingSpawn var0) {
		long var1 = 0L; // L: 8496
		int var3 = -1; // L: 8497
		int var4 = 0; // L: 8498
		int var5 = 0; // L: 8499
		if (var0.type == 0) { // L: 8500
			var1 = class36.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8501
			var1 = class36.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8502
			var1 = class36.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class36.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 8503
		}

		if (0L != var1) { // L: 8504
			int var6 = class36.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8505
			var3 = class232.Entity_unpackID(var1); // L: 8506
			var4 = var6 & 31; // L: 8507
			var5 = var6 >> 6 & 3; // L: 8508
		}

		var0.objectId = var3; // L: 8510
		var0.field1158 = var4; // L: 8511
		var0.field1157 = var5; // L: 8512
	} // L: 8513
}
