import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -899581373
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1174030445
	)
	@Export("size")
	int size;
	@ObfuscatedName("w")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("v")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("c")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("q")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("i")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("k")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	static void method580() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 273
			Login.currentLoginField = 1; // L: 274
		} else {
			Login.currentLoginField = 0; // L: 277
		}

	} // L: 279

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-958842860"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3699
			FriendsChatMember.clientPreferences.method2241(!FriendsChatMember.clientPreferences.method2209()); // L: 3700
			if (FriendsChatMember.clientPreferences.method2209()) { // L: 3701
				VarcInt.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3702
			} else {
				VarcInt.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3705
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3708
			FriendsChatMember.clientPreferences.method2255();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3709
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3710
		}

		if (Client.staffModLevel >= 2) { // L: 3711
			if (var0.equalsIgnoreCase("errortest")) { // L: 3712
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3713
				ClientPacket.worldMap.showCoord = !ClientPacket.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3714
				FriendsChatMember.clientPreferences.method2276(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3715
				FriendsChatMember.clientPreferences.method2276(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3716
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Clock.method3264(); // L: 3717
			}
		}

		PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 3720
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3721
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3722
		Client.packetWriter.addNode(var1); // L: 3723
	} // L: 3724

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1511176614"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9267
			Widget var0 = class128.getWidgetChild(class282.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9268
			if (var0 != null && var0.onTargetLeave != null) { // L: 9269
				ScriptEvent var1 = new ScriptEvent(); // L: 9270
				var1.widget = var0; // L: 9271
				var1.args = var0.onTargetLeave; // L: 9272
				SceneTilePaint.runScriptEvent(var1); // L: 9273
			}

			Client.selectedSpellItemId = -1; // L: 9275
			Client.isSpellSelected = false; // L: 9276
			class125.invalidateWidget(var0); // L: 9277
		}
	} // L: 9278
}
