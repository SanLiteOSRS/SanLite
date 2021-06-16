import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class143 {
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 592275981
	)
	@Export("menuY")
	static int menuY;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-349868767"
	)
	public static int method2815(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1661040540"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187310793"
	)
	static void method2810() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = WorldMapElement.method2721();
			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
				var6.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.writeInt(var8[0]);
				var6.writeInt(var8[1]);
				var6.writeLong(var1);
				var6.writeLong(0L);

				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.encryptRsa(class80.field983, class80.field984);
				var7.writeByte(10);

				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}

				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				if (Client.randomDatData != null) {
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var21 = PlatformInfo.method6115();
					var7.writeBytes(var21, 0, var21.length);
				}

				var7.writeLong(var5.nextLong());
				var7.encryptRsa(class80.field983, class80.field984);
				var9 = class44.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9);
				var10.writeStringCp1252NullTerminated(var4);
				var10.offset = var9;
				var10.xteaEncryptAll(var8);
				Buffer var11 = new Buffer(var7.offset + var6.offset + var10.offset + 5);
				var11.writeByte(2);
				var11.writeByte(var6.offset);
				var11.writeBytes(var6.array, 0, var6.offset);
				var11.writeByte(var7.offset);
				var11.writeBytes(var7.array, 0, var7.offset);
				var11.writeShort(var10.offset);
				var11.writeBytes(var10.array, 0, var10.offset);
				byte[] var13 = var11.array;
				int var15 = var13.length;
				StringBuilder var16 = new StringBuilder();

				int var19;
				for (int var17 = 0; var17 < var15 + 0; var17 += 3) {
					int var18 = var13[var17] & 255;
					var16.append(class303.field3747[var18 >>> 2]);
					if (var17 < var15 - 1) {
						var19 = var13[var17 + 1] & 255;
						var16.append(class303.field3747[(var18 & 3) << 4 | var19 >>> 4]);
						if (var17 < var15 - 2) {
							int var20 = var13[var17 + 2] & 255;
							var16.append(class303.field3747[(var19 & 15) << 2 | var20 >>> 6]).append(class303.field3747[var20 & 63]);
						} else {
							var16.append(class303.field3747[(var19 & 15) << 2]).append("=");
						}
					} else {
						var16.append(class303.field3747[(var18 & 3) << 4]).append("==");
					}
				}

				String var14 = var16.toString();
				var14 = var14;

				byte var3;
				try {
					URL var22 = new URL(class19.method283("services", false) + "m=accountappeal/login.ws");
					URLConnection var27 = var22.openConnection();
					var27.setDoInput(true);
					var27.setDoOutput(true);
					var27.setConnectTimeout(5000);
					OutputStreamWriter var23 = new OutputStreamWriter(var27.getOutputStream());
					var23.write("data2=" + Renderable.method4251(var14) + "&dest=" + Renderable.method4251("passwordchoice.ws"));
					var23.flush();
					InputStream var24 = var27.getInputStream();
					var11 = new Buffer(new byte[1000]);

					while (true) {
						var19 = var24.read(var11.array, var11.offset, 1000 - var11.offset);
						if (var19 == -1) {
							var23.close();
							var24.close();
							String var25 = new String(var11.array);
							if (var25.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var25.startsWith("WRONG")) {
								var3 = 7;
							} else if (var25.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var25.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var11.xteaDecryptAll(var8);

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) {
									--var11.offset;
								}

								var25 = new String(var11.array, 0, var11.offset);
								if (EnumComposition.method2831(var25)) {
									AttackOption.openURL(var25, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}

						var11.offset += var19;
						if (var11.offset >= 1000) {
							var3 = 5;
							break;
						}
					}
				} catch (Throwable var26) {
					var26.printStackTrace();
					var3 = 5;
				}

				var0 = var3;
			}

			switch(var0) {
			case 2:
				CollisionMap.setLoginResponseString(Strings.field3499, Strings.field3500, Strings.field3286);
				Login.loginIndex = 6;
				break;
			case 3:
				CollisionMap.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				CollisionMap.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				CollisionMap.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				CollisionMap.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				CollisionMap.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116352910"
	)
	public static void method2811() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-578637844"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = AbstractSocket.fontPlain12.lineWidth(var0, 250);
			int var6 = AbstractSocket.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215);
			AbstractSocket.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			AccessFile.method6437(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
			if (var1) {
				AbstractWorldMapData.rasterProvider.drawFull(0, 0);
			} else {
				ReflectionCheck.method1229(var3, var4, var5, var6);
			}

		}
	}
}
