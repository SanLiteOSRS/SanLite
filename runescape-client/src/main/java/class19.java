import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("sz")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lm;"
	)
	static class11 field154;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1889962401
	)
	public static int field146;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5318855028300081739L
	)
	long field153;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 5401092564904583073L
	)
	long field147;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	IterableNodeDeque field152;

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	public class19(Buffer var1) {
		this.field147 = -1L;
		this.field152 = new IterableNodeDeque();
		this.method291(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "-82"
	)
	void method291(Buffer var1) {
		this.field153 = var1.readLong();
		this.field147 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this);
			} else if (var2 == 3) {
				var3 = new class5(this);
			} else if (var2 == 2) {
				var3 = new class20(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod356(var1);
			this.field152.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1921642195"
	)
	public void method286(class3 var1) {
		if (var1.key == this.field153 && var1.field29 == this.field147) {
			for (class16 var2 = (class16)this.field152.last(); var2 != null; var2 = (class16)this.field152.previous()) {
				var2.vmethod352(var1);
			}

			++var1.field29;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lkj;",
		garbageValue = "1093888475"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lcj;I)V",
		garbageValue = "1133701143"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		FaceNormal.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(JLjava/lang/String;I)I",
		garbageValue = "2001653528"
	)
	static final int method297(long var0, String var2) {
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

		var4.encryptRsa(class80.field965, class80.field964);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var18 = Tile.method3356();
			var5.writeBytes(var18, 0, var18.length);
		}

		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class80.field965, class80.field964);
		var7 = Friend.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		String var10 = VarcInt.method4940(var11, 0, var11.length);
		String var12 = var10;

		try {
			URL var13 = new URL(FontName.method6285("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			var15.write("data2=" + class239.method4384(var12) + "&dest=" + class239.method4384("passwordchoice.ws"));
			var15.flush();
			InputStream var16 = var14.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var17 = var16.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var15.close();
					var16.close();
					String var19 = new String(var9.array);
					if (var19.startsWith("OFFLINE")) {
						return 4;
					} else if (var19.startsWith("WRONG")) {
						return 7;
					} else if (var19.startsWith("RELOAD")) {
						return 3;
					} else if (var19.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var19 = new String(var9.array, 0, var9.offset);
						if (MusicPatchPcmStream.method4150(var19)) {
							class302.openURL(var19, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var17;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var20) {
			var20.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-210463060"
	)
	public static void method284() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) {
				PendingSpawn.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "0"
	)
	public static int method295(int var0) {
		return WorldMapSection1.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-631164779"
	)
	static int method285(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class16.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			Canvas.privateChatMode = MidiPcmStream.method3952(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]);
			if (Canvas.privateChatMode == null) {
				Canvas.privateChatMode = PrivateChatMode.field3891;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			PacketBufferNode var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher);
			var11.packetBuffer.writeByte(Client.publicChatMode);
			var11.packetBuffer.writeByte(Canvas.privateChatMode.field3890);
			var11.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var11);
			return 1;
		} else {
			String var3;
			int var4;
			int var5;
			PacketBufferNode var6;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				class16.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field2224, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var3) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var3);
				var6.packetBuffer.writeByte(var4 - 1);
				var6.packetBuffer.writeByte(var5);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var7;
				Message var8;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class16.Interpreter_intStackSize -= 2;
					var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					var8 = UserComparator5.Messages_getByChannelAndID(var7, var4);
					if (var8 != null) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.count;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var9;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var9 = class301.Messages_getMessage(var7);
						if (var9 != null) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.type;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.cycle;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (Canvas.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Canvas.privateChatMode.field3890;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							var12 = class7.method100(var4, var3, class35.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							String var13 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2283, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var3);
							class2.method34(var12.packetBuffer, var13);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class16.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var6 = class7.method100(var4, var3, class35.clientLanguage, var5);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = DirectByteArrayCopier.Messages_getHistorySize(var7);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ChatChannel.Messages_getLastChatID(var7);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class44.method520(var7);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								Messages.doCheat(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field824 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field824;
								return 1;
							} else if (var0 == ScriptOpcodes.DEBUGMES) {
								var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								System.out.println(var3);
								return 1;
							} else if (var0 == 5024) {
								--class16.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class16.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								class16.Interpreter_intStackSize -= 2;
								var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
								var8 = UserComparator5.Messages_getByChannelAndID(var7, var4);
								if (var8 != null) {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.count;
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.sender != null ? var8.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.prefix != null ? var8.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.text != null ? var8.text : "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var8.isFromFriend() ? 1 : (var8.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
								var9 = class301.Messages_getMessage(var7);
								if (var9 != null) {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.type;
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.sender != null ? var9.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.prefix != null ? var9.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.text != null ? var9.text : "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9.isFromFriend() ? 1 : (var9.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (Varcs.localPlayer != null && Varcs.localPlayer.username != null) {
								var3 = Varcs.localPlayer.username.getName();
							} else {
								var3 = "";
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							return 1;
						}
					}
				}
			}
		}
	}
}
