import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1598413570
	)
	public static int field394;
	@ObfuscatedName("e")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("c")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lbt;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1516229081
	)
	int field386;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -4287014230983004767L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2087539793
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 846758933
	)
	int field395;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -970388059
	)
	int field396;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -2154226267889325457L
	)
	long field397;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2102380923
	)
	int field402;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -395356405
	)
	int field399;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 97839813
	)
	int field400;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 7909474248429099415L
	)
	long field398;
	@ObfuscatedName("y")
	boolean field390;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 214387207
	)
	int field403;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "[Lbt;"
	)
	PcmStream[] field401;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "[Lbt;"
	)
	PcmStream[] field393;

	protected PcmPlayer() {
		this.field386 = 32;
		this.timeMs = ObjectSound.currentTimeMillis();
		this.field397 = 0L;
		this.field402 = 0;
		this.field399 = 0;
		this.field400 = 0;
		this.field398 = 0L;
		this.field390 = true;
		this.field403 = 0;
		this.field401 = new PcmStream[8];
		this.field393 = new PcmStream[8];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "757289607"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1868594255"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1317116866"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("p")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "46"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-41"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Lbt;I)V",
		garbageValue = "-192979862"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1348614677"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = ObjectSound.currentTimeMillis();

			try {
				if (0L != this.field397) {
					if (var1 < this.field397) {
						return;
					}

					this.open(this.capacity);
					this.field397 = 0L;
					this.field390 = true;
				}

				int var3 = this.position();
				if (this.field400 - var3 > this.field402) {
					this.field402 = this.field400 - var3;
				}

				int var4 = this.field396 + this.field395;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field390 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field396 = var4 - this.field395;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field398) {
					if (!this.field390) {
						if (this.field402 == 0 && this.field399 == 0) {
							this.close();
							this.field397 = 2000L + var1;
							return;
						}

						this.field396 = Math.min(this.field399, this.field402);
						this.field399 = this.field402;
					} else {
						this.field390 = false;
					}

					this.field402 = 0;
					this.field398 = 2000L + var1;
				}

				this.field400 = var3;
			} catch (Exception var7) {
				this.close();
				this.field397 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / (field394 * 22050));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "650769052"
	)
	public final void method807() {
		this.field390 = true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-1"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field390 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field397 = ObjectSound.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1796301171"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class0.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class0.soundSystem.players[var2]) {
					class0.soundSystem.players[var2] = null;
				}

				if (class0.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class34.soundSystemExecutor.shutdownNow();
				class34.soundSystemExecutor = null;
				class0.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1654322502"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field403 -= var1;
		if (this.field403 < 0) {
			this.field403 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("am")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class305.clearIntArray(var1, 0, var3);
		this.field403 -= var2;
		if (this.stream != null && this.field403 <= 0) {
			this.field403 += field394 * 22050 >> 4;
			class238.PcmStream_disable(this.stream);
			this.method812(this.stream, this.stream.vmethod1039());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label104:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field401[var7];

						label98:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label98;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4124();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field386) {
										break label104;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field454; var14 != null; var14 = var11.nextSubStream()) {
											this.method812(var14, var15 * var14.vmethod1039() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field401[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field393[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field401[var6];
				PcmStream[] var17 = this.field401;
				this.field393[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field403 < 0) {
			this.field403 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ObjectSound.currentTimeMillis();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(Lbt;IB)V",
		garbageValue = "-48"
	)
	final void method812(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field393[var3];
		if (var4 == null) {
			this.field401[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field393[var3] = var1;
		var1.field454 = var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnk;I)V",
		garbageValue = "-618234199"
	)
	static final void method857(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 4) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = -1;
			int var6;
			int var7;
			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) {
				var6 = var0.method6610();
				int var8;
				int var11;
				int var12;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var11 = -1;
						var8 = var0.readUShortSmart();
						if (var8 == 32767) {
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var11 = var0.readUShortSmart();
						} else if (var8 != 32766) {
							var10 = var0.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var0.readUShortSmart();
						var3.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
					}
				}

				var7 = var0.method6610();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
						if (var10 != 32767) {
							var11 = var0.readUShortSmart();
							var12 = var0.method6610();
							var13 = var10 > 0 ? var0.method6609() : var12;
							var3.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var3.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var4 & 2) != 0) {
				var3.targetIndex = var0.method6617();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 8192) != 0) {
				for (var6 = 0; var6 < 3; ++var6) {
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 8) != 0) {
				var6 = var0.method6610();
				byte[] var14 = new byte[var6];
				Buffer var15 = new Buffer(var14);
				var0.readBytes(var14, 0, var6);
				Players.field1352[var2] = var15;
				var3.read(var15);
			}

			if ((var4 & 512) != 0) {
				Players.field1351[var2] = var0.method6584();
			}

			if ((var4 & 64) != 0) {
				var3.field1237 = var0.method6766();
				if (var3.pathLength == 0) {
					var3.orientation = var3.field1237;
					var3.field1237 = -1;
				}
			}

			if ((var4 & 256) != 0) {
				var3.field1240 = var0.method6678();
				var3.field1253 = var0.method6612();
				var3.field1252 = var0.readByte();
				var3.field1239 = var0.method6612();
				var3.field1255 = var0.method6617() + Client.cycle;
				var3.field1268 = var0.method6766() + Client.cycle;
				var3.field1213 = var0.method6617();
				if (var3.field1189) {
					var3.field1240 += var3.tileX;
					var3.field1253 += var3.tileY;
					var3.field1252 += var3.tileX;
					var3.field1239 += var3.tileY;
					var3.pathLength = 0;
				} else {
					var3.field1240 += var3.pathX[0];
					var3.field1253 += var3.pathY[0];
					var3.field1252 += var3.pathX[0];
					var3.field1239 += var3.pathY[0];
					var3.pathLength = 1;
				}

				var3.field1224 = 0;
			}

			if ((var4 & 128) != 0) {
				var6 = var0.readUnsignedShort();
				PlayerType var20 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var0.readUnsignedByte());
				boolean var18 = var0.method6610() == 1;
				var9 = var0.method6609();
				var10 = var0.offset;
				if (var3.username != null && var3.appearance != null) {
					boolean var19 = false;
					if (var20.isUser && class13.friendSystem.isIgnored(var3.username)) {
						var19 = true;
					}

					if (!var19 && Client.field716 == 0 && !var3.isHidden) {
						Players.field1362.offset = 0;
						var0.method6630(Players.field1362.array, 0, var9);
						Players.field1362.offset = 0;
						String var16 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(Players.field1362)));
						var3.overheadText = var16.trim();
						var3.overheadTextColor = var6 >> 8;
						var3.overheadTextEffect = var6 & 255;
						var3.overheadTextCyclesRemaining = 150;
						var3.isAutoChatting = var18;
						var3.field1208 = var3 != Varcs.localPlayer && var20.isUser && "" != Client.field824 && var16.toLowerCase().indexOf(Client.field824) == -1;
						if (var20.isPrivileged) {
							var13 = var18 ? 91 : 1;
						} else {
							var13 = var18 ? 90 : 2;
						}

						if (var20.modIcon != -1) {
							class69.addGameMessage(var13, class337.method5986(var20.modIcon) + var3.username.getName(), var16);
						} else {
							class69.addGameMessage(var13, var3.username.getName(), var16);
						}
					}
				}

				var0.offset = var10 + var9;
			}

			if ((var4 & 2048) != 0) {
				var5 = var0.method6678();
			}

			if ((var4 & 1024) != 0) {
				var3.spotAnimation = var0.method6617();
				var6 = var0.method6627();
				var3.field1238 = var6 >> 16;
				var3.field1249 = (var6 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1249 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 32) != 0) {
				var6 = var0.method6617();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var0.method6623();
				class32.performPlayerAnimation(var3, var6, var7);
			}

			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				if (var3.overheadText.charAt(0) == '~') {
					var3.overheadText = var3.overheadText.substring(1);
					class69.addGameMessage(2, var3.username.getName(), var3.overheadText);
				} else if (var3 == Varcs.localPlayer) {
					class69.addGameMessage(2, var3.username.getName(), var3.overheadText);
				}

				var3.isAutoChatting = false;
				var3.overheadTextColor = 0;
				var3.overheadTextEffect = 0;
				var3.overheadTextCyclesRemaining = 150;
			}

			if (var3.field1189) {
				if (var5 == 127) {
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					byte var17;
					if (var5 != -1) {
						var17 = var5;
					} else {
						var17 = Players.field1351[var2];
					}

					var3.method2120(var3.tileX, var3.tileY, var17);
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "276170039"
	)
	static int method837(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class16.Interpreter_intStackSize -= 2;
			Client.field855 = (short)TileItem.method2266(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]);
			if (Client.field855 <= 0) {
				Client.field855 = 256;
			}

			Client.field856 = (short)TileItem.method2266(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]);
			if (Client.field856 <= 0) {
				Client.field856 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class16.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class16.Interpreter_intStackSize -= 4;
			Client.field859 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			if (Client.field859 <= 0) {
				Client.field859 = 1;
			}

			Client.field742 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			if (Client.field742 <= 0) {
				Client.field742 = 32767;
			} else if (Client.field742 < Client.field859) {
				Client.field742 = Client.field859;
			}

			Client.field707 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
			if (Client.field707 <= 0) {
				Client.field707 = 1;
			}

			Client.field862 = (short)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
			if (Client.field862 <= 0) {
				Client.field862 = 32767;
			} else if (Client.field862 < Client.field707) {
				Client.field862 = Client.field707;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				Bounds.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ClientPreferences.method2221(Client.field855);
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ClientPreferences.method2221(Client.field856);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "434222247"
	)
	static boolean method855() {
		return (Client.drawPlayerNames & 8) != 0;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		signature = "(Lhu;III)V",
		garbageValue = "-2082124704"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class13.method220(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class13.method220(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class34.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menuOptionsCount - 1;
				if (var3 != -1) {
					class25.tempMenuAction = new MenuAction();
					class25.tempMenuAction.param0 = Client.menuArguments1[var3];
					class25.tempMenuAction.param1 = Client.menuArguments2[var3];
					class25.tempMenuAction.opcode = Client.menuOpcodes[var3];
					class25.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					class25.tempMenuAction.action = Client.menuActions[var3];
				}

			}
		}
	}
}
