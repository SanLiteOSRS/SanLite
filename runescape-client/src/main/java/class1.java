import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class1 implements Callable {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1698122621
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("k")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final Buffer field3;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lp;Lop;La;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field3 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod18(this.field3);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "284961543"
	)
	static final int method15(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class65.field822, class65.field823);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var23 = ObjectSound.method1771();
			var5.writeBytes(var23, 0, var23.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field822, class65.field823);
		var7 = Client.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = class114.method2545(var9.array);

		try {
			URL var11 = new URL(HealthBar.method2246("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			String var15 = "data2=" + class355.method6403(var10) + "&dest=";
			int var17 = "passwordchoice.ws".length();
			StringBuilder var18 = new StringBuilder(var17);

			for (int var19 = 0; var19 < var17; ++var19) {
				char var20 = "passwordchoice.ws".charAt(var19);
				if ((var20 < 'a' || var20 > 'z') && (var20 < 'A' || var20 > 'Z') && (var20 < '0' || var20 > '9') && var20 != '.' && var20 != '-' && var20 != '*' && var20 != '_') {
					if (var20 == ' ') {
						var18.append('+');
					} else {
						byte var21 = AbstractSocket.charToByteCp1252(var20);
						var18.append('%');
						int var22 = var21 >> 4 & 15;
						if (var22 >= 10) {
							var18.append((char)(var22 + 55));
						} else {
							var18.append((char)(var22 + 48));
						}

						var22 = var21 & 15;
						if (var22 >= 10) {
							var18.append((char)(var22 + 55));
						} else {
							var18.append((char)(var22 + 48));
						}
					}
				} else {
					var18.append(var20);
				}
			}

			String var16 = var18.toString();
			var13.write(var15 + var16);
			var13.flush();
			InputStream var24 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var25 = var24.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var25 == -1) {
					var13.close();
					var24.close();
					String var27 = new String(var9.array);
					if (var27.startsWith("OFFLINE")) {
						return 4;
					} else if (var27.startsWith("WRONG")) {
						return 7;
					} else if (var27.startsWith("RELOAD")) {
						return 3;
					} else if (var27.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var27 = new String(var9.array, 0, var9.offset);
						if (Occluder.method4484(var27)) {
							class91.openURL(var27, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var25;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var26) {
			var26.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "207642979"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		class275.method5201(2);
		if (var0) {
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class408.clientPreferences.rememberedUsername != null) {
				Login.Login_username = class408.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		ParamComposition.method3216();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2113911304"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)V",
		garbageValue = "217206746"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3180 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3194 == null) {
				var0.field3194 = new int[var0.field3180.length];
			}

			var0.field3194[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Ljf;III)V",
		garbageValue = "-989741563"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var4 * var8 + var7 * var5 >> 11;
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = var9 + HealthBarDefinition.localPlayer.x >> 7;
					int var12 = HealthBarDefinition.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2749, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method6962(class19.baseX * 64 + var11);
					var13.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(HealthBarDefinition.localPlayer.x);
					var13.packetBuffer.writeShort(HealthBarDefinition.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
