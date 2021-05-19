import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("h")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("c")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1623185181"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1344768115"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Low;",
		garbageValue = "42192399"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = Strings.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = Strings.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1);
		if (var19 == null) {
			return null;
		} else {
			SpritePixels var20 = null;
			if (var9.noteTemplate != -1) {
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var20 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var20 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var20 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method3818(16, 16);
			Rasterizer3D.field2254 = false;
			if (var9.placeholderTemplate != -1) {
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = (int)(1.5D * (double)var16);
			} else if (var2 == 2) {
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var19.calculateBoundsCylinder();
			var19.method4136(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != -1) {
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				StudioGame.ItemDefinition_fontPlain11.draw(class261.method4790(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2254 = true;
			return var8;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-112"
	)
	static int method2000(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			WorldMapCacheName.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			AbstractArchive.privateChatMode = EnumComposition.method2727(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]);
			if (AbstractArchive.privateChatMode == null) {
				AbstractArchive.privateChatMode = PrivateChatMode.field3899;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(AbstractArchive.privateChatMode.field3898);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var6 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					var5 = class124.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						var4 = Fonts.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (AbstractArchive.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AbstractArchive.privateChatMode.field3898;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
							var12 = UserComparator10.method2486(var7, var8, class7.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class13.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
							var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2607, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							Occluder.method4089(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
							var6 = UserComparator10.method2486(var7, var8, class7.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class10.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = NetCache.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class105.method2274(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
								class4.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field843 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Client.field843;
								return 1;
							} else if (var0 == ScriptOpcodes.DEBUGMES) {
								var8 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--WorldMapCacheName.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++WorldMapCacheName.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								WorldMapCacheName.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
								var5 = class124.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
								var4 = Fonts.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class35.localPlayer != null && class35.localPlayer.username != null) {
								var8 = class35.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
