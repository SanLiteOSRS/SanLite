import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("n")
public class class16 implements ThreadFactory {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("i")
	final ThreadGroup field74;
	@ObfuscatedName("w")
	final AtomicInteger field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field75 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field74 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field74, var1, this.this$0.field62 + "-rest-request-" + this.field75.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-8513816"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class54.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILie;ZI)V",
		garbageValue = "-1672363550"
	)
	static void method219(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class54.getWorldMap().getMapArea(var0);
		int var4 = HealthBarDefinition.localPlayer.plane;
		int var5 = class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7);
		int var6 = DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		class54.getWorldMap().method6635(var3, var7, var1, var2);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(ZLoj;I)V",
		garbageValue = "-615408576"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field591 = 0;
		Client.field512 = 0;
		WorldMapLabel.method3970();

		int var2;
		NPC var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
			var2 = var1.readBits(15);
			if (var2 == 32767) {
				break;
			}

			boolean var3 = false;
			if (Client.npcs[var2] == null) {
				Client.npcs[var2] = new NPC();
				var3 = true;
			}

			var4 = Client.npcs[var2];
			Client.npcIndices[++Client.npcCount - 1] = var2;
			var4.npcCycle = Client.cycle;
			boolean var10;
			if (Players.field1254) {
				var4.definition = ScriptFrame.getNpcDefinition(var1.readBits(14));
				if (var0) {
					var6 = var1.readBits(8);
					if (var6 > 127) {
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5);
					if (var6 > 15) {
						var6 -= 32;
					}
				}

				var8 = var1.readBits(1);
				if (var8 == 1) {
					Client.field513[++Client.field512 - 1] = var2;
				}

				var9 = Client.defaultRotations[var1.readBits(3)];
				if (var3) {
					var4.orientation = var4.rotation = var9;
				}

				var10 = var1.readBits(1) == 1;
				if (var10) {
					var1.readBits(32);
				}

				if (var0) {
					var7 = var1.readBits(8);
					if (var7 > 127) {
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5);
					if (var7 > 15) {
						var7 -= 32;
					}
				}

				var5 = var1.readBits(1);
			} else {
				if (var0) {
					var6 = var1.readBits(8);
					if (var6 > 127) {
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5);
					if (var6 > 15) {
						var6 -= 32;
					}
				}

				var4.definition = ScriptFrame.getNpcDefinition(var1.readBits(14));
				if (var0) {
					var7 = var1.readBits(8);
					if (var7 > 127) {
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5);
					if (var7 > 15) {
						var7 -= 32;
					}
				}

				var5 = var1.readBits(1);
				var8 = Client.defaultRotations[var1.readBits(3)];
				if (var3) {
					var4.orientation = var4.rotation = var8;
				}

				var9 = var1.readBits(1);
				if (var9 == 1) {
					Client.field513[++Client.field512 - 1] = var2;
				}

				var10 = var1.readBits(1) == 1;
				if (var10) {
					var1.readBits(32);
				}
			}

			var4.field1087 = var4.definition.size * 64;
			var4.field1138 = var4.definition.rotation;
			if (var4.field1138 == 0) {
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence;
			var4.walkBackSequence = var4.definition.walkBackSequence;
			var4.walkLeftSequence = var4.definition.walkLeftSequence;
			var4.walkRightSequence = var4.definition.walkRightSequence;
			var4.idleSequence = var4.definition.idleSequence;
			var4.turnLeftSequence = var4.definition.turnLeftSequence;
			var4.turnRightSequence = var4.definition.turnRightSequence;
			var4.method2249(HealthBarDefinition.localPlayer.pathX[0] + var6, HealthBarDefinition.localPlayer.pathY[0] + var7, var5 == 1);
		}

		var1.exportIndex();

		int var14;
		for (var2 = 0; var2 < Client.field512; ++var2) {
			var14 = Client.field513[var2];
			var4 = Client.npcs[var14];
			var5 = var1.readUnsignedByte();
			if (Players.field1254 && (var5 & 128) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 4) != 0) {
				var6 = var1.method6996();
				int var11;
				int var12;
				int var15;
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var15 = -1;
						var11 = -1;
						var8 = var1.readUShortSmart();
						if (var8 == 32767) {
							var8 = var1.readUShortSmart();
							var15 = var1.readUShortSmart();
							var9 = var1.readUShortSmart();
							var11 = var1.readUShortSmart();
						} else if (var8 != 32766) {
							var15 = var1.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var1.readUShortSmart();
						var4.addHitSplat(var8, var15, var9, var11, Client.cycle, var12);
					}
				}

				var7 = var1.method6995();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var1.readUShortSmart();
						var15 = var1.readUShortSmart();
						if (var15 != 32767) {
							var11 = var1.readUShortSmart();
							var12 = var1.readUnsignedByte();
							int var13 = var15 > 0 ? var1.method6995() : var12;
							var4.addHealthBar(var9, Client.cycle, var15, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var5 & 512) != 0) {
				var4.field1145 = var1.readInt();
			}

			if ((var5 & 2) != 0) {
				var4.definition = ScriptFrame.getNpcDefinition(var1.method7120());
				var4.field1087 = var4.definition.size * 64;
				var4.field1138 = var4.definition.rotation;
				var4.walkSequence = var4.definition.walkSequence;
				var4.walkBackSequence = var4.definition.walkBackSequence;
				var4.walkLeftSequence = var4.definition.walkLeftSequence;
				var4.walkRightSequence = var4.definition.walkRightSequence;
				var4.idleSequence = var4.definition.idleSequence;
				var4.turnLeftSequence = var4.definition.turnLeftSequence;
				var4.turnRightSequence = var4.definition.turnRightSequence;
			}

			if ((var5 & 16) != 0) {
				var4.targetIndex = var1.method7004();
				if (var4.targetIndex == 65535) {
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 1) != 0) {
				var6 = var1.method7006();
				var7 = var1.method7006();
				if (Players.field1254) {
					var4.field1127 = var1.method6995() == 1;
				}

				var8 = var4.x - (var6 - class19.baseX * 64 - class19.baseX * 64) * 64;
				var9 = var4.y - (var7 - DefaultsGroup.baseY * 64 - DefaultsGroup.baseY * 64) * 64;
				if (var8 != 0 || var9 != 0) {
					var4.field1112 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
				}
			}

			if (Players.field1254 && (var5 & 256) != 0 || !Players.field1254 && (var5 & 128) != 0) {
				var4.field1083 = var1.method7128();
				var4.field1100 = var1.method6973();
				var4.field1128 = var1.method7128();
				var4.field1130 = var1.method6999();
				var4.field1131 = var1.method7120() + Client.cycle;
				var4.field1132 = var1.readUnsignedShort() + Client.cycle;
				var4.field1133 = var1.method7004();
				var4.pathLength = 1;
				var4.field1144 = 0;
				var4.field1083 += var4.pathX[0];
				var4.field1100 += var4.pathY[0];
				var4.field1128 += var4.pathX[0];
				var4.field1130 += var4.pathY[0];
			}

			if ((var5 & 32) != 0) {
				var6 = var1.method7004();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var1.readUnsignedByte();
				if (var6 == var4.sequence && var6 != -1) {
					var8 = MouseHandler.SequenceDefinition_get(var6).field1965;
					if (var8 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var7;
						var4.field1116 = 0;
					}

					if (var8 == 2) {
						var4.field1116 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || MouseHandler.SequenceDefinition_get(var6).field1959 >= MouseHandler.SequenceDefinition_get(var4.sequence).field1959) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var7;
					var4.field1116 = 0;
					var4.field1144 = var4.pathLength;
				}
			}

			if ((var5 & 64) != 0) {
				var4.spotAnimation = var1.readUnsignedShort();
				var6 = var1.method7044();
				var4.field1126 = var6 >> 16;
				var4.field1125 = (var6 & 65535) + Client.cycle;
				var4.spotAnimationFrame = 0;
				var4.spotAnimationFrameCycle = 0;
				if (var4.field1125 > Client.cycle) {
					var4.spotAnimationFrame = -1;
				}

				if (var4.spotAnimation == 65535) {
					var4.spotAnimation = -1;
				}
			}

			if ((var5 & 8) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}
		}

		for (var2 = 0; var2 < Client.field591; ++var2) {
			var14 = Client.field592[var2];
			if (Client.npcs[var14].npcCycle != Client.cycle) {
				Client.npcs[var14].definition = null;
				Client.npcs[var14] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}

		}
	}
}
