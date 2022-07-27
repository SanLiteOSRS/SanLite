import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -2138418185
	)
	static int field459;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = 658947165
	)
	static int field461;
	@ObfuscatedName("di")
	static boolean field462;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 390457225
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("u")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1620928609"
	)
	static final void method1057() {
		LoginScreenAnimation.method2279("You can't add yourself to your own friend list"); // L: 108
	} // L: 109

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "114"
	)
	static int method1056(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3854
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3855
			Client.field644 = (short)class1.method7(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]); // L: 3856
			if (Client.field644 <= 0) { // L: 3857
				Client.field644 = 256;
			}

			Client.field695 = (short)class1.method7(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 3858
			if (Client.field695 <= 0) { // L: 3859
				Client.field695 = 256;
			}

			return 1; // L: 3860
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3862
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3863
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3864
			if (Client.zoomHeight <= 0) { // L: 3865
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3866
			if (Client.zoomWidth <= 0) { // L: 3867
				Client.zoomWidth = 320;
			}

			return 1; // L: 3868
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3870
			TaskHandler.Interpreter_intStackSize -= 4; // L: 3871
			Client.field677 = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3872
			if (Client.field677 <= 0) { // L: 3873
				Client.field677 = 1;
			}

			Client.field756 = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3874
			if (Client.field756 <= 0) { // L: 3875
				Client.field756 = 32767;
			} else if (Client.field756 < Client.field677) { // L: 3876
				Client.field756 = Client.field677;
			}

			Client.field757 = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3877
			if (Client.field757 <= 0) { // L: 3878
				Client.field757 = 1;
			}

			Client.field567 = (short)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 3879
			if (Client.field567 <= 0) { // L: 3880
				Client.field567 = 32767;
			} else if (Client.field567 < Client.field757) { // L: 3881
				Client.field567 = Client.field757;
			}

			return 1; // L: 3882
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3884
			if (Client.viewportWidget != null) { // L: 3885
				class115.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3886
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3887
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3888
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3891
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3892
			}

			return 1; // L: 3894
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3896
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3897
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3898
			return 1; // L: 3899
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3901
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapCacheName.method5048(Client.field644); // L: 3902
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapCacheName.method5048(Client.field695); // L: 3903
			return 1; // L: 3904
		} else if (var0 == 6220) { // L: 3906
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3907
			return 1; // L: 3908
		} else if (var0 == 6221) { // L: 3910
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3911
			return 1; // L: 3912
		} else if (var0 == 6222) { // L: 3914
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class352.canvasWidth; // L: 3915
			return 1; // L: 3916
		} else if (var0 == 6223) { // L: 3918
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class228.canvasHeight; // L: 3919
			return 1; // L: 3920
		} else {
			return 2; // L: 3922
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "67"
	)
	static String method1055(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12288
		if (Client.gameBuild == 1) { // L: 12289
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12290
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12291
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12292
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12293
			var0 = "local";
		}

		String var3 = ""; // L: 12294
		if (Script.field975 != null) { // L: 12295
			var3 = "/p=" + Script.field975;
		}

		String var4 = "runescape.com"; // L: 12296
		return var2 + var0 + "." + var4 + "/l=" + class21.clientLanguage + "/a=" + Decimator.field402 + var3 + "/"; // L: 12297
	}
}
