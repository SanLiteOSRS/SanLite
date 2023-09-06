import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
public class class161 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2110571145
	)
	int field1790;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -713647017
	)
	int field1789;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class161(class146 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1790 = var1.readInt(); // L: 274
		this.field1789 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3177(this.field1790, this.field1789); // L: 279
	} // L: 280

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-577871422"
	)
	static final void method3289(String var0, int var1) {
		PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3181, Client.packetWriter.isaacCipher); // L: 242
		var2.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 243
		var2.packetBuffer.writeByte(var1); // L: 244
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 245
		Client.packetWriter.addNode(var2); // L: 246
	} // L: 247

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1877408335"
	)
	static int method3288(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4347
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class218.getWindowedMode(); // L: 4348
			return 1; // L: 4349
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4351
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4352
				if (var3 == 1 || var3 == 2) { // L: 4353
					class270.setWindowedMode(var3);
				}

				return 1; // L: 4354
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4356
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class449.clientPreferences.method2470(); // L: 4357
				return 1; // L: 4358
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4360
				if (var0 == 5310) { // L: 4367
					--SoundCache.Interpreter_intStackSize; // L: 4368
					return 1; // L: 4369
				} else {
					return 2; // L: 4371
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4361
				if (var3 == 1 || var3 == 2) { // L: 4362
					class449.clientPreferences.method2469(var3); // L: 4363
				}

				return 1; // L: 4365
			}
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "229621192"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12753
		short[] var2 = new short[16]; // L: 12754
		int var3 = 0; // L: 12755

		for (int var4 = 0; var4 < HealthBar.ItemComposition_fileCount; ++var4) { // L: 12756
			ItemComposition var9 = InvDefinition.ItemComposition_get(var4); // L: 12757
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12758 12759 12760
				if (var3 >= 250) { // L: 12761
					KeyHandler.foundItemIdCount = -1; // L: 12762
					class156.foundItemIds = null; // L: 12763
					return; // L: 12764
				}

				if (var3 >= var2.length) { // L: 12766
					short[] var6 = new short[var2.length * 2]; // L: 12767

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12768
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12769
				}

				var2[var3++] = (short)var4; // L: 12771
			}
		}

		class156.foundItemIds = var2; // L: 12773
		class372.foundItemIndex = 0; // L: 12774
		KeyHandler.foundItemIdCount = var3; // L: 12775
		String[] var8 = new String[KeyHandler.foundItemIdCount]; // L: 12776

		for (int var5 = 0; var5 < KeyHandler.foundItemIdCount; ++var5) { // L: 12777
			var8[var5] = InvDefinition.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class156.foundItemIds; // L: 12778
		FriendSystem.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12780
	} // L: 12782
}
