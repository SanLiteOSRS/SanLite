import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
public class class7 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("t")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("hg")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("o")
	ExecutorService field23;
	@ObfuscatedName("q")
	Future field29;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	final Buffer field24;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class3 field25;

	@ObfuscatedSignature(
		descriptor = "(Lqw;Lu;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field23 = Executors.newSingleThreadExecutor(); // L: 10
		this.field24 = var1; // L: 16
		this.field25 = var2; // L: 17
		this.method38(); // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-16"
	)
	public boolean method59() {
		return this.field29.isDone(); // L: 22
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "464827960"
	)
	public void method40() {
		this.field23.shutdown(); // L: 26
		this.field23 = null; // L: 27
	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "1906945635"
	)
	public Buffer method41() {
		try {
			return (Buffer)this.field29.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1090779878"
	)
	void method38() {
		this.field29 = this.field23.submit(new class1(this, this.field24, this.field25)); // L: 40
	} // L: 41

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lcy;",
		garbageValue = "-1669033629"
	)
	static ClientPreferences method57() {
		AccessFile var0 = null; // L: 112
		ClientPreferences var1 = new ClientPreferences(); // L: 113

		try {
			var0 = Actor.getPreferencesFile("", AbstractByteArrayCopier.field3293.name, false); // L: 115
			byte[] var2 = new byte[(int)var0.length()]; // L: 116

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 117 118 121
				var4 = var0.read(var2, var3, var2.length - var3); // L: 119
				if (var4 == -1) {
					throw new IOException(); // L: 120
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 123
		} catch (Exception var6) { // L: 125
		}

		try {
			if (var0 != null) { // L: 127
				var0.close();
			}
		} catch (Exception var5) { // L: 129
		}

		return var1; // L: 130
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "41"
	)
	public static boolean method51(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 29
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-710386351"
	)
	public static int[] method58() {
		int[] var0 = new int[KeyHandler.field131]; // L: 259

		for (int var1 = 0; var1 < KeyHandler.field131; ++var1) { // L: 260
			var0[var1] = KeyHandler.field146[var1]; // L: 261
		}

		return var0; // L: 263
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1175506688"
	)
	static boolean method50(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 1152
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 1153
				return true;
			}
		}

		return false; // L: 1155
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-2145740720"
	)
	static int method42(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3798
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3799
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3800
			int var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3801
			if (!Client.isCameraLocked) { // L: 3802
				Client.camAngleX = var3; // L: 3803
				Client.camAngleY = var4; // L: 3804
			}

			return 1; // L: 3806
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3808
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3809
			return 1; // L: 3810
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3812
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3813
			return 1; // L: 3814
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3816
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3817
			if (var3 < 0) { // L: 3818
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3819
			return 1; // L: 3820
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3822
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3823
			return 1; // L: 3824
		} else {
			return 2; // L: 3826
		}
	}
}
