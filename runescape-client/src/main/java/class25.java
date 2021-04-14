import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("y")
public class class25 extends class16 {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2008748649
	)
	static int field197;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		signature = "Lcx;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2084790717
	)
	int field199;
	@ObfuscatedName("o")
	byte field193;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 181056935
	)
	int field192;
	@ObfuscatedName("p")
	String field195;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		signature = "(Lx;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field199 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		var1.readUnsignedByte();
		this.field199 = var1.readUnsignedShort();
		this.field193 = var1.readByte();
		this.field192 = var1.readUnsignedShort();
		var1.readLong();
		this.field195 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = (class9)var1.field27.get(this.field199);
		var2.field66 = this.field193;
		var2.field64 = this.field192;
		var2.field65 = this.field195;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-33"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Login.loginIndex = 2;
		if (var0) {
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (Login.clientPreferences.rememberedUsername != null) {
				Login.Login_username = Login.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		Canvas.method481();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1554369565"
	)
	static int method350(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class16.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
