import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("FriendsChatMember")
public class FriendsChatMember extends Buddy {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("ignored")
	TriBool ignored;

	FriendsChatMember() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1300571849"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1945487843"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = NetSocket.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "601254132"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440591589"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = NetSocket.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1024085126"
	)
	static void method5712() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(KitDefinition.method2705("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var23 = var7.readLong();
						var1 = var23;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var38) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var39 = Login.Login_username;
				Random var40 = new Random();
				Buffer var27 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var40.nextInt(), var40.nextInt(), (int)(var1 >> 32), (int)var1};
				var27.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var27.writeInt(var40.nextInt());
				}

				var27.writeInt(var10[0]);
				var27.writeInt(var10[1]);
				var27.writeLong(var1);
				var27.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var27.writeInt(var40.nextInt());
				}

				var27.encryptRsa(class80.field1006, class80.field1007);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var40.nextInt());
				}

				var9.writeLong(var40.nextLong());
				var9.writeLongMedium(var40.nextLong());
				if (Client.randomDatData != null) {
					var9.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var12 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var12);

						int var13;
						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) {
						}

						if (var13 >= 24) {
							throw new IOException();
						}
					} catch (Exception var37) {
						for (int var14 = 0; var14 < 24; ++var14) {
							var12[var14] = -1;
						}
					}

					var9.writeBytes(var12, 0, var12.length);
				}

				var9.writeLong(var40.nextLong());
				var9.encryptRsa(class80.field1006, class80.field1007);
				var11 = Tiles.stringCp1252NullTerminatedByteSize(var39);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var41 = new Buffer(var11);
				var41.writeStringCp1252NullTerminated(var39);
				var41.offset = var11;
				var41.xteaEncryptAll(var10);
				Buffer var28 = new Buffer(var41.offset + var27.offset + var9.offset + 5);
				var28.writeByte(2);
				var28.writeByte(var27.offset);
				var28.writeBytes(var27.array, 0, var27.offset);
				var28.writeByte(var9.offset);
				var28.writeBytes(var9.array, 0, var9.offset);
				var28.writeShort(var41.offset);
				var28.writeBytes(var41.array, 0, var41.offset);
				byte[] var15 = var28.array;
				int var17 = var15.length;
				StringBuilder var18 = new StringBuilder();

				int var21;
				for (int var19 = 0; var19 < var17 + 0; var19 += 3) {
					int var20 = var15[var19] & 255;
					var18.append(class302.field3743[var20 >>> 2]);
					if (var19 < var17 - 1) {
						var21 = var15[var19 + 1] & 255;
						var18.append(class302.field3743[(var20 & 3) << 4 | var21 >>> 4]);
						if (var19 < var17 - 2) {
							int var22 = var15[var19 + 2] & 255;
							var18.append(class302.field3743[(var21 & 15) << 2 | var22 >>> 6]).append(class302.field3743[var22 & 63]);
						} else {
							var18.append(class302.field3743[(var21 & 15) << 2]).append("=");
						}
					} else {
						var18.append(class302.field3743[(var20 & 3) << 4]).append("==");
					}
				}

				String var16 = var18.toString();
				var16 = var16;

				byte var34;
				try {
					URL var31 = new URL(KitDefinition.method2705("services", false) + "m=accountappeal/login.ws");
					URLConnection var42 = var31.openConnection();
					var42.setDoInput(true);
					var42.setDoOutput(true);
					var42.setConnectTimeout(5000);
					OutputStreamWriter var32 = new OutputStreamWriter(var42.getOutputStream());
					var32.write("data2=" + FloorUnderlayDefinition.method2839(var16) + "&dest=" + FloorUnderlayDefinition.method2839("passwordchoice.ws"));
					var32.flush();
					InputStream var33 = var42.getInputStream();
					var28 = new Buffer(new byte[1000]);

					while (true) {
						var21 = var33.read(var28.array, var28.offset, 1000 - var28.offset);
						if (var21 == -1) {
							var32.close();
							var33.close();
							String var35 = new String(var28.array);
							if (var35.startsWith("OFFLINE")) {
								var34 = 4;
							} else if (var35.startsWith("WRONG")) {
								var34 = 7;
							} else if (var35.startsWith("RELOAD")) {
								var34 = 3;
							} else if (var35.startsWith("Not permitted for social network accounts.")) {
								var34 = 6;
							} else {
								var28.xteaDecryptAll(var10);

								while (var28.offset > 0 && var28.array[var28.offset - 1] == 0) {
									--var28.offset;
								}

								var35 = new String(var28.array, 0, var28.offset);
								if (Interpreter.method1848(var35)) {
									Players.openURL(var35, true, false);
									var34 = 2;
								} else {
									var34 = 5;
								}
							}
							break;
						}

						var28.offset += var21;
						if (var28.offset >= 1000) {
							var34 = 5;
							break;
						}
					}
				} catch (Throwable var36) {
					var36.printStackTrace();
					var34 = 5;
				}

				var0 = var34;
			}

			switch(var0) {
			case 2:
				class260.setLoginResponseString(Strings.field3503, Strings.field3504, Strings.field3505);
				Login.loginIndex = 6;
				break;
			case 3:
				class260.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class260.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class260.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class260.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class260.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
