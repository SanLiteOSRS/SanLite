import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class14 {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1849354153
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -255968433
	)
	final int field65;
	@ObfuscatedName("w")
	final String field62;
	@ObfuscatedName("s")
	final ThreadFactory field68;
	@ObfuscatedName("a")
	final ThreadPoolExecutor field64;

	public class14(String var1, int var2, int var3) {
		this.field62 = var1;
		this.field65 = var2;
		this.field68 = new class16(this);
		this.field64 = this.method179(var3);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "2016209231"
	)
	final ThreadPoolExecutor method179(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field65), this.field68);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lx;B)Ld;",
		garbageValue = "-121"
	)
	public class19 method187(class10 var1) {
		if (this.field64.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field64.getCorePoolSize() + " Queue capacity " + this.field65);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field64.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	public final void method181() {
		try {
			this.field64.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "27"
	)
	static int method190(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = Tile.method4199(Interpreter.Interpreter_intStack[--Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1162(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = MusicPatch.method4949(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 3];
				var3 = MusicPatch.method4949(var3, var5, var6);
				var7 = class123.method2619(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = class269.method5190(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = UserComparator6.method2512(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1];
				var5 = Language.method5533(var3, var4);
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-376967441"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (ScriptEvent.pcmPlayer1 != null) {
			ScriptEvent.pcmPlayer1.run();
		}

		if (HealthBar.pcmPlayer0 != null) {
			HealthBar.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V",
		garbageValue = "394697143"
	)
	static final void method180(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = GameBuild.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = GameBuild.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = GameBuild.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = GameBuild.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = GameBuild.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class21.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1076 = var4;
		var0.field1075 = var5;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1644375573"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2729, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7001(ReflectionCheck.selectedItemSlot);
			var8.packetBuffer.method7001(DefaultsGroup.baseY * 64 + var1);
			var8.packetBuffer.method7010(MouseHandler.selectedItemWidget);
			var8.packetBuffer.method6962(class19.baseX * 64 + var0);
			var8.packetBuffer.method7001(var3);
			var8.packetBuffer.method7003(SoundSystem.selectedItemId);
			var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2738, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7126(FontName.selectedSpellWidget);
			var8.packetBuffer.method6962(Client.selectedSpellChildIndex);
			var8.packetBuffer.method6962(class19.baseX * 64 + var0);
			var8.packetBuffer.method7001(Client.field627);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6962(var3);
			var8.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2744, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7001(class19.baseX * 64 + var0);
			var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
			var8.packetBuffer.method6962(var3);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7001(class19.baseX * 64 + var0);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2690, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(class19.baseX * 64 + var0);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
			var8.packetBuffer.method6962(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2705, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method7003(var3);
			var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
			var8.packetBuffer.method7003(class19.baseX * 64 + var0);
			var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2722, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6962(SoundSystem.selectedItemId);
					var9.packetBuffer.method7001(ReflectionCheck.selectedItemSlot);
					var9.packetBuffer.method7126(MouseHandler.selectedItemWidget);
					var9.packetBuffer.method7003(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2741, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeIntME(FontName.selectedSpellWidget);
					var9.packetBuffer.method6962(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6962(var3);
					var9.packetBuffer.writeShort(Client.field627);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2717, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method7001(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2748, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7001(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2723, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6962(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2730, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method7001(var3);
					var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6962(var3);
						var9.packetBuffer.method6962(SoundSystem.selectedItemId);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6962(ReflectionCheck.selectedItemSlot);
						var9.packetBuffer.writeIntME(MouseHandler.selectedItemWidget);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2760, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6962(Client.field627);
						var9.packetBuffer.method7003(var3);
						var9.packetBuffer.method7003(Client.selectedSpellChildIndex);
						var9.packetBuffer.writeInt(FontName.selectedSpellWidget);
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2756, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7003(var3);
					var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.writeShort(SoundSystem.selectedItemId);
					var8.packetBuffer.writeShort(class19.baseX * 64 + var0);
					var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7003(ReflectionCheck.selectedItemSlot);
					var8.packetBuffer.method7010(MouseHandler.selectedItemWidget);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2735, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7003(Client.field627);
					var8.packetBuffer.method6962(var3);
					var8.packetBuffer.method7001(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.writeInt(FontName.selectedSpellWidget);
					var8.packetBuffer.method7001(Client.selectedSpellChildIndex);
					var8.packetBuffer.method7003(class19.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2701, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6962(class19.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2768, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method7001(var3);
					var8.packetBuffer.writeShort(class19.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2709, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6962(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6962(class19.baseX * 64 + var0);
					var8.packetBuffer.method6962(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2763, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6962(DefaultsGroup.baseY * 64 + var1);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method7003(class19.baseX * 64 + var0);
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2767, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6962(class19.baseX * 64 + var0);
					var8.packetBuffer.method7003(var3);
					var8.packetBuffer.writeShort(DefaultsGroup.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						GameBuild.scene.setViewportWalking();
					} else {
						GameBuild.scene.menuOpen(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = UserComparator9.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = GrandExchangeOfferAgeComparator.method5423(var16);
						}

						if (var12) {
							var11 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = ItemContainer.getWidgetChild(var1, var0);
							if (var16 != null) {
								class262.Widget_runOnTargetLeave();
								Decimator.selectSpell(var1, var0, SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = class20.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + MouseHandler.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = MouseHandler.colorStartTag(65280) + var16.spellName + MouseHandler.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							method191();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UserComparator9.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									WorldMapLabelSize.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UserComparator9.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										WorldMapLabelSize.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class92.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ItemContainer.getWidgetChild(var1, var0);
									class184.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2702, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6962(var3);
								var8.packetBuffer.method7010(var1);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method7010(MouseHandler.selectedItemWidget);
								var8.packetBuffer.method7003(SoundSystem.selectedItemId);
								var8.packetBuffer.method6962(ReflectionCheck.selectedItemSlot);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 32) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2695, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7003(var0);
								var8.packetBuffer.writeInt(FontName.selectedSpellWidget);
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
								var8.packetBuffer.method7010(var1);
								var8.packetBuffer.method6962(var3);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 33) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2706, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7003(var3);
								var8.packetBuffer.method7001(var0);
								var8.packetBuffer.writeIntME(var1);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 34) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2740, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6962(var3);
								var8.packetBuffer.method6962(var0);
								var8.packetBuffer.writeIntME(var1);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 35) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7003(var3);
								var8.packetBuffer.method6962(var0);
								var8.packetBuffer.writeIntME(var1);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 36) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method7003(var3);
								var8.packetBuffer.method7001(var0);
								var8.packetBuffer.method7126(var1);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else if (var2 == 37) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2731, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6962(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method7010(var1);
								Client.packetWriter.addNode(var8);
								Client.field576 = 0;
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
								Client.field577 = var0;
							} else {
								if (var2 == 38) {
									class262.Widget_runOnTargetLeave();
									var16 = UserComparator9.getWidget(var1);
									Client.isItemSelected = 1;
									ReflectionCheck.selectedItemSlot = var0;
									MouseHandler.selectedItemWidget = var1;
									SoundSystem.selectedItemId = var3;
									class184.invalidateWidget(var16);
									Client.selectedItemName = MouseHandler.colorStartTag(16748608) + TaskHandler.ItemDefinition_get(var3).name + MouseHandler.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2691, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method7001(var3);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field576 = 0;
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
									Client.field577 = var0;
								} else if (var2 == 40) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method7001(var0);
									Client.packetWriter.addNode(var8);
									Client.field576 = 0;
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
									Client.field577 = var0;
								} else if (var2 == 41) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2718, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method7003(var0);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field576 = 0;
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
									Client.field577 = var0;
								} else if (var2 == 42) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field576 = 0;
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
									Client.field577 = var0;
								} else if (var2 == 43) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2694, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method7003(var3);
									Client.packetWriter.addNode(var8);
									Client.field576 = 0;
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
									Client.field577 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2687, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6962(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2710, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2769, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6962(var3);
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2692, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7003(var3);
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2714, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method7001(var3);
										var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2728, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method7003(var3);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label646: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ItemContainer.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2753, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6962(var16.itemId);
													var9.packetBuffer.writeInt(FontName.selectedSpellWidget);
													var9.packetBuffer.method6962(var0);
													var9.packetBuffer.writeInt(var1);
													var9.packetBuffer.method6962(Client.field627);
													var9.packetBuffer.method6962(Client.selectedSpellChildIndex);
													Client.packetWriter.addNode(var9);
												}
												break label646;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2693, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6962(class19.baseX * 64 + var0);
												var8.packetBuffer.method7003(var3);
												var8.packetBuffer.method7003(DefaultsGroup.baseY * 64 + var1);
												var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												Client.packetWriter.addNode(var8);
												break label646;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2697, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7001(var3);
												Client.packetWriter.addNode(var8);
												break label646;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var13 = Client.npcs[var3];
												if (var13 != null) {
													NPCComposition var17 = var13.definition;
													if (var17.transforms != null) {
														var17 = var17.transform();
													}

													if (var17 != null) {
														var11 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2757, Client.packetWriter.isaacCipher);
														var11.packetBuffer.writeShort(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label646;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2755, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method7003(var3);
												Client.packetWriter.addNode(var8);
												break label646;
											}

											if (var2 == 1005) {
												var16 = UserComparator9.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													class397.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + TaskHandler.ItemDefinition_get(var3).name);
												} else {
													var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2755, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method7003(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field576 = 0;
												WorldMapSection2.field2037 = UserComparator9.getWidget(var1);
												Client.field577 = var0;
												break label646;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1010 || var2 == 1008 || var2 == 1011 || var2 == 1012) {
													class133.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label646;
											}
										}

										var16 = ItemContainer.getWidgetChild(var1, var0);
										if (var16 != null) {
											GrandExchangeEvents.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			class184.invalidateWidget(UserComparator9.getWidget(MouseHandler.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class262.Widget_runOnTargetLeave();
		}

		if (WorldMapSection2.field2037 != null && Client.field576 == 0) {
			class184.invalidateWidget(WorldMapSection2.field2037);
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2112486118"
	)
	static final void method178(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class408.clientPreferences.musicVolume) {
			if (class408.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				Archive var1 = Messages.archive6;
				int var2 = Client.currentTrackGroupId;
				class247.musicPlayerStatus = 1;
				class128.musicTrackArchive = var1;
				class411.musicTrackGroupId = var2;
				ArchiveDiskActionHandler.musicTrackFileId = 0;
				class247.musicTrackVolume = var0;
				SecureRandomCallable.musicTrackBoolean = false;
				class247.pcmSampleLength = 10000;
				Client.field710 = false;
			} else if (var0 == 0) {
				WorldMapCacheName.method4027();
				Client.field710 = false;
			} else {
				WorldMapSection0.method3917(var0);
			}

			class408.clientPreferences.musicVolume = var0;
			Login.savePreferences();
		}

	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1351549041"
	)
	static final void method191() {
		PacketBufferNode var0 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2712, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				Players.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class184.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
