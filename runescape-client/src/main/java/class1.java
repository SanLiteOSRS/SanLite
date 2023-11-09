import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class1 implements Callable {
	@ObfuscatedName("wa")
	static Iterator field6;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static Widget field5;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	final Buffer field1;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class3 field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lal;Lsg;Lac;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field3 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field3.vmethod13(this.field1); // L: 54
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([III[FI)V",
		garbageValue = "580310026"
	)
	public static void method8(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && Rasterizer3D.field2512 == Rasterizer3D.field2519) { // L: 130
			Rasterizer3D.field2519 = Rasterizer3D.field2518; // L: 131
		}

		Rasterizer3D.field2519.method4477(var0, var1, var2, var3); // L: 133
	} // L: 134

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1439083269"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3518
			FloorUnderlayDefinition.method3865(); // L: 3519
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class20.clientPreferences.method2461() != 0 && !Client.playingJingle) { // L: 3521
			Actor.method2399(2, class399.archive6, var0, 0, class20.clientPreferences.method2461(), false); // L: 3522
		}

		Client.currentTrackGroupId = var0; // L: 3524
	} // L: 3525

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static final void method12() {
		class133.method3165(WorldMapRectangle.field3006, Players.field1344, KitDefinition.field1957); // L: 3696
		GraphicsObject.method2026(ScriptEvent.field1041, class86.field1082); // L: 3697
		if (class36.cameraX == WorldMapRectangle.field3006 && class174.cameraY == Players.field1344 && class297.cameraZ == KitDefinition.field1957 && ScriptEvent.field1041 == WorldMapSectionType.cameraPitch && class125.cameraYaw == class86.field1082) { // L: 3698
			Client.field731 = false; // L: 3699
			Client.isCameraLocked = false; // L: 3700
			Client.field673 = false; // L: 3701
			Client.field747 = false; // L: 3702
			FontName.field4884 = 0; // L: 3703
			MilliClock.field1871 = 0; // L: 3704
			ScriptFrame.field469 = 0; // L: 3705
			Archive.field4213 = 0; // L: 3706
			WorldMapElement.field1937 = 0; // L: 3707
			class138.field1637 = 0; // L: 3708
			class25.field137 = 0; // L: 3709
			class179.field1902 = 0; // L: 3710
			class123.field1499 = 0; // L: 3711
			class16.field90 = 0; // L: 3712
			Client.field667 = null; // L: 3713
			Client.field737 = null; // L: 3714
			Client.field750 = null; // L: 3715
		}

	} // L: 3717

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "339651855"
	)
	static void method11() {
		PacketBufferNode var0 = class330.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 4272
		var0.packetBuffer.writeByte(GrandExchangeOfferNameComparator.getWindowedMode()); // L: 4273
		var0.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 4274
		var0.packetBuffer.writeShort(class262.canvasHeight); // L: 4275
		Client.packetWriter.addNode(var0); // L: 4276
	} // L: 4277
}
