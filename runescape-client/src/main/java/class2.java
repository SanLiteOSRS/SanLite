import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
final class class2 implements class0 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "192866787"
	)
	public void vmethod69(Object var1, Buffer var2) {
		this.method25((Long)var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1094020977"
	)
	public Object vmethod72(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Long;Lkb;B)V",
		garbageValue = "3"
	)
	void method25(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "929998205"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	static void method38() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(NPC.method2157("services", false) + "m=accountappeal/login.ws");
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
						long var22 = var7.readLong();
						var1 = var22;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var30) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var31 = Login.Login_username;
				Random var32 = new Random();
				Buffer var26 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var32.nextInt(), var32.nextInt(), (int)(var1 >> 32), (int)var1};
				var26.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var32.nextInt());
				}

				var26.writeInt(var10[0]);
				var26.writeInt(var10[1]);
				var26.writeLong(var1);
				var26.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var26.writeInt(var32.nextInt());
				}

				var26.encryptRsa(class89.field1166, class89.field1167);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var32.nextInt());
				}

				var9.writeLong(var32.nextLong());
				var9.writeLongMedium(var32.nextLong());
				Language.method3801(var9);
				var9.writeLong(var32.nextLong());
				var9.encryptRsa(class89.field1166, class89.field1167);
				var11 = SpriteMask.stringCp1252NullTerminatedByteSize(var31);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var31);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var12.offset + var26.offset + var9.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var26.offset);
				var13.writeBytes(var26.array, 0, var26.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				byte[] var15 = var13.array;
				String var14 = class299.method5418(var15, 0, var15.length);
				String var16 = var14;

				byte var27;
				try {
					URL var17 = new URL(NPC.method2157("services", false) + "m=accountappeal/login.ws");
					URLConnection var18 = var17.openConnection();
					var18.setDoInput(true);
					var18.setDoOutput(true);
					var18.setConnectTimeout(5000);
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
					var19.write("data2=" + class204.method3829(var16) + "&dest=" + class204.method3829("passwordchoice.ws"));
					var19.flush();
					InputStream var20 = var18.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var21 = var20.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var21 == -1) {
							var19.close();
							var20.close();
							String var28 = new String(var13.array);
							if (var28.startsWith("OFFLINE")) {
								var27 = 4;
							} else if (var28.startsWith("WRONG")) {
								var27 = 7;
							} else if (var28.startsWith("RELOAD")) {
								var27 = 3;
							} else if (var28.startsWith("Not permitted for social network accounts.")) {
								var27 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var28 = new String(var13.array, 0, var13.offset);
								if (HealthBarUpdate.method1870(var28)) {
									Skeleton.openURL(var28, true, false);
									var27 = 2;
								} else {
									var27 = 5;
								}
							}
							break;
						}

						var13.offset += var21;
						if (var13.offset >= 1000) {
							var27 = 5;
							break;
						}
					}
				} catch (Throwable var29) {
					var29.printStackTrace();
					var27 = 5;
				}

				var0 = var27;
			}

			switch(var0) {
			case 2:
				GrandExchangeOfferNameComparator.setLoginResponseString(Strings.field3054, Strings.field3055, Strings.field3056);
				Login.loginIndex = 6;
				break;
			case 3:
				GrandExchangeOfferNameComparator.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				GrandExchangeOfferNameComparator.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				GrandExchangeOfferNameComparator.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				GrandExchangeOfferNameComparator.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				GrandExchangeOfferNameComparator.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1215217092"
	)
	static final void method30() {
		if (ClientPacket.ClanChat_inClanChat) {
			if (DevicePcmPlayerProvider.clanChat != null) {
				DevicePcmPlayerProvider.clanChat.sort();
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.clearIsInClanChat();
			}

			ClientPacket.ClanChat_inClanChat = false;
		}

	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1276683355"
	)
	static final void method41() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				class13.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1946760208"
	)
	static boolean method28() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lht;I)Ljava/lang/String;",
		garbageValue = "1452658207"
	)
	static String method39(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + HorizontalAlignment.method4880(WorldMapID.method663(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		signature = "(IIIZB)V",
		garbageValue = "-2"
	)
	public static void method42(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class4.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.method5674(var0);
		var4.packetBuffer.method5684(var3 ? Client.field763 : 0);
		Client.packetWriter.addNode(var4);
	}
}
