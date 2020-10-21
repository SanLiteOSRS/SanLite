import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class41 {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		signature = "Ldt;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lis;",
		garbageValue = "306746421"
	)
	public static StudioGame[] method624() {
		return new StudioGame[]{StudioGame.game4, StudioGame.game3, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game5, StudioGame.runescape};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IILgk;Lft;B)Z",
		garbageValue = "68"
	)
	static final boolean method619(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class182.directions[var6][var7] = 99;
		class182.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class182.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class182.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class182.bufferX[var11];
			var5 = class182.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				class182.field2135 = var4;
				class182.field2136 = var5;
				return true;
			}

			int var15 = class182.distances[var16][var17] + 1;
			if (var16 > 0 && class182.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17] = 2;
				class182.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class182.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17] = 8;
				class182.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class182.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 - 1] = 1;
				class182.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class182.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class182.bufferX[var18] = var4;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16][var17 + 1] = 4;
				class182.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class182.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 - 1] = 3;
				class182.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class182.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 - 1] = 9;
				class182.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class182.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class182.bufferX[var18] = var4 - 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 - 1][var17 + 1] = 6;
				class182.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class182.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class182.bufferX[var18] = var4 + 1;
				class182.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class182.directions[var16 + 1][var17 + 1] = 12;
				class182.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		class182.field2135 = var4;
		class182.field2136 = var5;
		return false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "2053521560"
	)
	public static int method622() {
		return KeyHandler.KeyHandler_idleCycles;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1795227808"
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

		ScriptFrame.method1192();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
