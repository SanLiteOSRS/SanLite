import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class93 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Loi;II)Loi;",
		garbageValue = "1752251062"
	)
	@Export("findEnumerated")
	public static class371 findEnumerated(class371[] var0, int var1) {
		class371[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class371 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-1309017793"
	)
	static void method2408(float[] var0) {
		var0[1] = 1.0F - var0[1]; // L: 330
		if (var0[0] < 0.0F) { // L: 331
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) { // L: 332
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) { // L: 333
			float var1 = (float)((double)(var0[0] * (var0[0] - 2.0F + var0[1])) + (double)var0[1] * ((double)var0[1] - 2.0D) + 1.0D); // L: 334
			if (var1 + class126.field1494 > 0.0F) { // L: 335
				Actor.method2434(var0); // L: 336
			}
		}

		var0[1] = 1.0F - var0[1]; // L: 339
	} // L: 340

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	static void method2410(boolean var0) {
		byte var1 = 0; // L: 1165
		if (!class338.method6631()) { // L: 1166
			var1 = 12; // L: 1167
		} else if (class415.client.method1248() || class415.client.isOtlTokenRequesterInitialized() || class415.client.method1249()) { // L: 1169
			var1 = 10; // L: 1170
		}

		ObjectSound.method1926(var1); // L: 1172
		if (var0) { // L: 1173
			Login.Login_username = ""; // L: 1174
			Login.Login_password = ""; // L: 1175
			Skills.field3830 = 0; // L: 1176
			class165.otp = ""; // L: 1177
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1180
			if (ScriptFrame.clientPreferences.method2504() != null) { // L: 1181
				Login.Login_username = ScriptFrame.clientPreferences.method2504(); // L: 1182
				Client.Login_isUsernameRemembered = true; // L: 1183
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1185
			}
		}

		Message.method1227(); // L: 1187
	} // L: 1188

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldo;B)V",
		garbageValue = "8"
	)
	static void method2409(NPC var0) {
		var0.field1181 = var0.definition.size; // L: 9063
		var0.field1228 = var0.definition.rotation; // L: 9064
		var0.walkSequence = var0.definition.walkSequence; // L: 9065
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9066
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9067
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9068
		var0.idleSequence = var0.definition.idleSequence; // L: 9069
		var0.field1184 = var0.definition.turnLeftSequence; // L: 9070
		var0.field1185 = var0.definition.turnRightSequence; // L: 9071
		var0.runSequence = var0.definition.field2023; // L: 9072
		var0.field1191 = var0.definition.field2024; // L: 9073
		var0.field1192 = var0.definition.field2025; // L: 9074
		var0.field1193 = var0.definition.field2026; // L: 9075
		var0.field1194 = var0.definition.field2028; // L: 9076
		var0.field1195 = var0.definition.field2020; // L: 9077
		var0.field1196 = var0.definition.field2029; // L: 9078
		var0.field1197 = var0.definition.field2030; // L: 9079
	} // L: 9080

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	public static boolean method2412() {
		return Client.clickedWidget != null; // L: 12849
	}
}
