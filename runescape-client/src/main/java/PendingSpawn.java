import java.awt.Component;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dv")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1023930455
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -569523289
	)
	@Export("type")
	int type;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1633819283
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2019699419
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1049216013
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1071594059
	)
	int field1140;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -12280057
	)
	int field1133;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1405378325
	)
	int field1148;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 962562353
	)
	int field1141;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1128778359
	)
	int field1142;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1460152863
	)
	int field1143;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2125358201
	)
	int field1144;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1835031023
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1114479713
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1144 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2117639418"
	)
	void method2346(int var1) {
		this.field1144 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-116866001"
	)
	boolean method2351(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1144 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-213752479"
	)
	static void method2355(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "27"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 127
		var2.size = var0.readUnsignedByte(); // L: 128
		var2.id = var0.readInt(); // L: 129
		var2.operations = new int[var2.size]; // L: 130
		var2.creationErrors = new int[var2.size]; // L: 131
		var2.fields = new Field[var2.size]; // L: 132
		var2.intReplaceValues = new int[var2.size]; // L: 133
		var2.methods = new Method[var2.size]; // L: 134
		var2.arguments = new byte[var2.size][][]; // L: 135

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 136
			try {
				int var4 = var0.readUnsignedByte(); // L: 138
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 139
					if (var4 == 3 || var4 == 4) { // L: 149
						var5 = var0.readStringCp1252NullTerminated(); // L: 150
						var6 = var0.readStringCp1252NullTerminated(); // L: 151
						var7 = var0.readUnsignedByte(); // L: 152
						String[] var8 = new String[var7]; // L: 153

						for (int var9 = 0; var9 < var7; ++var9) { // L: 154
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 155
						byte[][] var10 = new byte[var7][]; // L: 156
						int var12;
						if (var4 == 3) { // L: 157
							for (int var11 = 0; var11 < var7; ++var11) { // L: 158
								var12 = var0.readInt(); // L: 159
								var10[var11] = new byte[var12]; // L: 160
								var0.readBytes(var10[var11], 0, var12); // L: 161
							}
						}

						var2.operations[var3] = var4; // L: 164
						Class[] var21 = new Class[var7]; // L: 165

						for (var12 = 0; var12 < var7; ++var12) { // L: 166
							var21[var12] = KeyHandler.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = KeyHandler.loadClassFromDescriptor(var20); // L: 167
						if (KeyHandler.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = KeyHandler.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var17.length == var21.length) { // L: 177
									boolean var18 = true; // L: 178

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 179
										if (var21[var19] != var17[var19]) { // L: 180
											var18 = false; // L: 181
											break; // L: 182
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 185
										var2.methods[var3] = var16; // L: 186
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 193
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 140
					var6 = var0.readStringCp1252NullTerminated(); // L: 141
					var7 = 0; // L: 142
					if (var4 == 1) { // L: 143
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 144
					var2.intReplaceValues[var3] = var7; // L: 145
					if (KeyHandler.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(KeyHandler.loadClassFromDescriptor(var5), var6); // L: 147
				}
			} catch (ClassNotFoundException var24) { // L: 196
				var2.creationErrors[var3] = -1; // L: 197
			} catch (SecurityException var25) { // L: 199
				var2.creationErrors[var3] = -2; // L: 200
			} catch (NullPointerException var26) { // L: 202
				var2.creationErrors[var3] = -3; // L: 203
			} catch (Exception var27) { // L: 205
				var2.creationErrors[var3] = -4; // L: 206
			} catch (Throwable var28) { // L: 208
				var2.creationErrors[var3] = -5; // L: 209
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120477731"
	)
	static void method2353() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 54

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 55
			var1.clearIsFromIgnored(); // L: 57
		}

	} // L: 60

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2029580457"
	)
	static void method2350() {
		Client.packetWriter.clearBuffer(); // L: 2829
		Client.packetWriter.packetBuffer.offset = 0; // L: 2830
		Client.packetWriter.serverPacket = null; // L: 2831
		Client.packetWriter.field1390 = null; // L: 2832
		Client.packetWriter.field1393 = null; // L: 2833
		Client.packetWriter.field1392 = null; // L: 2834
		Client.packetWriter.serverPacketLength = 0; // L: 2835
		Client.packetWriter.field1388 = 0; // L: 2836
		Client.rebootTimer = 0; // L: 2837
		Player.method2340(); // L: 2838
		Client.minimapState = 0; // L: 2839
		Client.destinationX = 0; // L: 2840

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2841
			Client.players[var0] = null;
		}

		Projectile.localPlayer = null; // L: 2842

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2843
			NPC var1 = Client.npcs[var0]; // L: 2844
			if (var1 != null) { // L: 2845
				var1.targetIndex = -1; // L: 2846
				var1.false0 = false; // L: 2847
			}
		}

		class6.method36(); // L: 2850
		UserComparator8.method2855(30); // L: 2851

		for (var0 = 0; var0 < 100; ++var0) { // L: 2852
			Client.field723[var0] = true;
		}

		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 2855
		var2.packetBuffer.writeByte(class237.getWindowedMode()); // L: 2856
		var2.packetBuffer.writeShort(class448.canvasWidth); // L: 2857
		var2.packetBuffer.writeShort(WorldMapID.canvasHeight); // L: 2858
		Client.packetWriter.addNode(var2); // L: 2859
	} // L: 2861

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method2354() {
		if (class30.field152 != null) { // L: 12767
			Client.field698 = Client.cycle; // L: 12768
			class30.field152.method6887(); // L: 12769

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12770
				if (Client.players[var0] != null) { // L: 12771
					class30.field152.method6876(class213.baseX * 64 + (Client.players[var0].x >> 7), class101.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12772
				}
			}
		}

	} // L: 12776
}
