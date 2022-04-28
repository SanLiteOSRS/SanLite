import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("by")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1442012707
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 895014891
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -420653117
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1496061701
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1469136561
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1839040857
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1959449499
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1003905831
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -466516667
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1789079227
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1371380693
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("p")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("w")
	@Export("x")
	double x;
	@ObfuscatedName("k")
	@Export("y")
	double y;
	@ObfuscatedName("d")
	@Export("z")
	double z;
	@ObfuscatedName("m")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("u")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("t")
	@Export("speed")
	double speed;
	@ObfuscatedName("g")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1968761335
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1799408283
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -957445753
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 75771285
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = ClientPreferences.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class163.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "5"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Liq;",
		garbageValue = "103"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ClientPreferences.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "385748138"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3844();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	static void method1975(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpz;II)V",
		garbageValue = "168694674"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1283[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1283;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = LoginPacket.method5195(var0);
						var10000 = Players.field1283;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						PlayerComposition.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1283[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1283;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = LoginPacket.method5195(var0);
							var10000 = Players.field1283;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							PlayerComposition.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1283[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1283;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = LoginPacket.method5195(var0);
								var10000 = Players.field1283;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (class175.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1283;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1283[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1283;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = LoginPacket.method5195(var0);
									var10000 = Players.field1283;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (class175.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1283;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1283;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = Client.players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 64) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}

							Login.method1932(var0, var4, var5, var6);
						}

						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-574030857"
	)
	static int method1976(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
			Actor.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2;
			GrandExchangeOfferOwnWorldComparator.performPlayerAnimation(GrandExchangeEvents.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) {
				Interpreter.field841 = true;
			}

			return 1;
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
				var15 = 0;
				if (class300.isNumber(var7)) {
					var15 = class19.method288(var7);
				}

				PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher);
				var13.packetBuffer.writeInt(var15);
				Client.packetWriter.addNode(var13);
				return 1;
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2992, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
					var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher);
					var11.packetBuffer.writeByte(var7.length() + 1);
					var11.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var11);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
						MidiPcmStream.method5366(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						Widget var14 = class127.getWidget(var9);
						ParamComposition.clickWidget(var14, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						Widget var12 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
						ParamComposition.clickWidget(var12, var10, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						GameBuild.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2263() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class131.clientPreferences.method2246(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						class391.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class122.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class425.stringCp1252NullTerminatedByteSize(var4) + class425.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.method7703(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Nameable.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.canvasWidth;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class321.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field668 = 3;
						Client.field628 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field668 = 2;
						Client.field628 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field668 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field668 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field668 = 3;
						Client.field628 = var2 ? WorldMapID.scriptDotWidget.id : Interpreter.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var3;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class131.clientPreferences.method2230(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2317() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var3;
							if (!var3) {
								class131.clientPreferences.method2286("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							class131.clientPreferences.method2237(!var3);
							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class131.clientPreferences.method2279() ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class166.method3342();
							return 1;
						} else if (var0 == 3155) {
							--class122.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class122.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class122.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class122.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							class113.method2650(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							return 1;
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.method3578();
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							if (var0 == 3187) {
								class122.Interpreter_stringStackSize -= 2;
								return 1;
							} else {
								return var0 == 3188 ? 1 : 2;
							}
						} else {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-875242540"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
