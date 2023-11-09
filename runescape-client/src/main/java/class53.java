import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
public class class53 extends Node {
	@ObfuscatedName("ap")
	static byte[][][] field367;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 576168065
	)
	static int field364;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	class47 field366;

	public class53() {
		this.field366 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lci;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field366 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbe;)V"
	)
	public class53(RawSound var1) {
		this.field366 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	public boolean method1098() {
		return this.field366 == null; // L: 24
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lbe;",
		garbageValue = "-1946103560"
	)
	public RawSound method1105() {
		if (this.field366 != null && this.field366.field328.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1100(); // L: 31
			} finally {
				this.field366.field328.unlock(); // L: 34
			}

			return var1; // L: 36
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lbe;",
		garbageValue = "-14"
	)
	public RawSound method1099() {
		if (this.field366 != null) { // L: 42
			this.field366.field328.lock(); // L: 43

			RawSound var1;
			try {
				var1 = this.method1100(); // L: 46
			} finally {
				this.field366.field328.unlock(); // L: 49
			}

			return var1; // L: 51
		} else {
			return null; // L: 53
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lbe;",
		garbageValue = "0"
	)
	RawSound method1100() {
		if (this.field366.field327 == null) { // L: 57
			this.field366.field327 = this.field366.field329.toRawSound((int[])null); // L: 58
			this.field366.field329 = null; // L: 59
		}

		return this.field366.field327; // L: 61
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-1907473559"
	)
	static int method1111(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4344
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class179.getWindowedMode(); // L: 4345
			return 1; // L: 4346
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4348
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4349
				if (var3 == 1 || var3 == 2) { // L: 4350
					class168.setWindowedMode(var3);
				}

				return 1; // L: 4351
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4353
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.clientPreferences.method2523(); // L: 4354
				return 1; // L: 4355
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4357
				if (var0 == 5310) { // L: 4364
					--Interpreter.Interpreter_intStackSize; // L: 4365
					return 1; // L: 4366
				} else {
					return 2; // L: 4368
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4358
				if (var3 == 1 || var3 == 2) { // L: 4359
					ScriptFrame.clientPreferences.method2525(var3); // L: 4360
				}

				return 1; // L: 4362
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-955940254"
	)
	static final void method1096() {
		int var0;
		int var1;
		int var2;
		if (!Client.field779) { // L: 4094
			var0 = class90.field1106 * 128 + 64; // L: 4095
			var1 = ClanSettings.field1742 * 16384 + 64; // L: 4096
			var2 = class291.getTileHeight(var0, var1, BuddyRankComparator.Client_plane) - Buddy.field4655; // L: 4097
			class350.method6676(var0, var2, var1); // L: 4098
		} else if (Client.field760 != null) { // L: 4100
			PacketWriter.cameraX = Client.field760.vmethod8468(); // L: 4101
			World.cameraZ = Client.field760.vmethod8474(); // L: 4102
			if (Client.field759) { // L: 4103
				class309.cameraY = Client.field760.vmethod8470(); // L: 4104
			} else {
				class309.cameraY = class291.getTileHeight(PacketWriter.cameraX, World.cameraZ, BuddyRankComparator.Client_plane) - Client.field760.vmethod8470(); // L: 4107
			}

			Client.field760.method8480(); // L: 4109
		}

		if (!Client.field758) { // L: 4111
			var0 = class238.field2688 * 128 + 64; // L: 4112
			var1 = Language.field4367 * 16384 + 64; // L: 4113
			var2 = class291.getTileHeight(var0, var1, BuddyRankComparator.Client_plane) - field364; // L: 4114
			int var3 = var0 - PacketWriter.cameraX; // L: 4115
			int var4 = var2 - class309.cameraY; // L: 4116
			int var5 = var1 - World.cameraZ; // L: 4117
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 4118
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 4119
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 4120
			ObjectSound.method1937(var7, var8); // L: 4121
		} else {
			if (Client.field762 != null) { // L: 4124
				ModeWhere.cameraPitch = Client.field762.method8464(); // L: 4125
				ModeWhere.cameraPitch = Math.min(Math.max(ModeWhere.cameraPitch, 128), 383); // L: 4126
				Client.field762.method8480(); // L: 4127
			}

			if (Client.field761 != null) { // L: 4129
				class13.cameraYaw = Client.field761.method8464() & 2047; // L: 4130
				Client.field761.method8480(); // L: 4131
			}
		}

	} // L: 4134

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1971809844"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11375
	}
}
