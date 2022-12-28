import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("hk")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("s")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;

	ModelData0() {
	} // L: 4

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "0"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class37.reflectionChecks.last(); // L: 25
		if (var1 != null) { // L: 26
			int var2 = var0.offset; // L: 27
			var0.method8536(var1.id); // L: 28

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 29
				if (var1.creationErrors[var3] != 0) { // L: 30
					var0.writeByte(var1.creationErrors[var3]); // L: 31
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 35
						Field var5;
						int var6;
						if (var4 == 0) { // L: 36
							var5 = var1.fields[var3]; // L: 37
							var6 = Reflection.getInt(var5, (Object)null); // L: 38
							var0.writeByte(0); // L: 39
							var0.method8536(var6); // L: 40
						} else if (var4 == 1) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 44
							var0.writeByte(0); // L: 45
						} else if (var4 == 2) { // L: 47
							var5 = var1.fields[var3]; // L: 48
							var6 = var5.getModifiers(); // L: 49
							var0.writeByte(0); // L: 50
							var0.method8536(var6); // L: 51
						}

						Method var25;
						if (var4 != 3) { // L: 53
							if (var4 == 4) { // L: 73
								var25 = var1.methods[var3]; // L: 74
								var6 = var25.getModifiers(); // L: 75
								var0.writeByte(0); // L: 76
								var0.method8536(var6); // L: 77
							}
						} else {
							var25 = var1.methods[var3]; // L: 54
							byte[][] var10 = var1.arguments[var3]; // L: 55
							Object[] var7 = new Object[var10.length]; // L: 56

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 57
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 58
								var7[var8] = var9.readObject(); // L: 59
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 61
							if (var11 == null) { // L: 62
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 63
								var0.writeByte(1); // L: 64
								var0.writeLong(((Number)var11).longValue()); // L: 65
							} else if (var11 instanceof String) { // L: 67
								var0.writeByte(2); // L: 68
								var0.writeStringCp1252NullTerminated((String)var11); // L: 69
							} else {
								var0.writeByte(4); // L: 71
							}
						}
					} catch (ClassNotFoundException var13) { // L: 80
						var0.writeByte(-10); // L: 81
					} catch (InvalidClassException var14) { // L: 83
						var0.writeByte(-11); // L: 84
					} catch (StreamCorruptedException var15) { // L: 86
						var0.writeByte(-12); // L: 87
					} catch (OptionalDataException var16) { // L: 89
						var0.writeByte(-13); // L: 90
					} catch (IllegalAccessException var17) { // L: 92
						var0.writeByte(-14); // L: 93
					} catch (IllegalArgumentException var18) { // L: 95
						var0.writeByte(-15); // L: 96
					} catch (InvocationTargetException var19) { // L: 98
						var0.writeByte(-16); // L: 99
					} catch (SecurityException var20) { // L: 101
						var0.writeByte(-17); // L: 102
					} catch (IOException var21) { // L: 104
						var0.writeByte(-18); // L: 105
					} catch (NullPointerException var22) { // L: 107
						var0.writeByte(-19); // L: 108
					} catch (Exception var23) { // L: 110
						var0.writeByte(-20); // L: 111
					} catch (Throwable var24) { // L: 113
						var0.writeByte(-21); // L: 114
					}
				}
			}

			var0.writeCrc(var2); // L: 117
			var1.remove(); // L: 118
		}
	} // L: 119

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "49295"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = AttackOption.getWidgetChild(var1, var2); // L: 9873
		if (var5 != null) { // L: 9874
			if (var5.onOp != null) { // L: 9875
				ScriptEvent var6 = new ScriptEvent(); // L: 9876
				var6.widget = var5; // L: 9877
				var6.opIndex = var0; // L: 9878
				var6.targetName = var4; // L: 9879
				var6.args = var5.onOp; // L: 9880
				WorldMapElement.runScriptEvent(var6); // L: 9881
			}

			boolean var8 = true; // L: 9883
			if (var5.contentType > 0) { // L: 9884
				var8 = NPC.method2583(var5);
			}

			if (var8) { // L: 9885
				if (class251.method5275(Clock.getWidgetFlags(var5), var0 - 1)) { // L: 9886
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9889
						var7 = class136.getPacketBufferNode(ClientPacket.field3060, Client.packetWriter.isaacCipher); // L: 9891
						var7.packetBuffer.method8536(var1); // L: 9892
						var7.packetBuffer.writeShort(var2); // L: 9893
						var7.packetBuffer.writeShort(var3); // L: 9894
						Client.packetWriter.addNode(var7); // L: 9895
					}

					if (var0 == 2) { // L: 9897
						var7 = class136.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 9899
						var7.packetBuffer.method8536(var1); // L: 9900
						var7.packetBuffer.writeShort(var2); // L: 9901
						var7.packetBuffer.writeShort(var3); // L: 9902
						Client.packetWriter.addNode(var7); // L: 9903
					}

					if (var0 == 3) { // L: 9905
						var7 = class136.getPacketBufferNode(ClientPacket.field3070, Client.packetWriter.isaacCipher); // L: 9907
						var7.packetBuffer.method8536(var1); // L: 9908
						var7.packetBuffer.writeShort(var2); // L: 9909
						var7.packetBuffer.writeShort(var3); // L: 9910
						Client.packetWriter.addNode(var7); // L: 9911
					}

					if (var0 == 4) { // L: 9913
						var7 = class136.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 9915
						var7.packetBuffer.method8536(var1); // L: 9916
						var7.packetBuffer.writeShort(var2); // L: 9917
						var7.packetBuffer.writeShort(var3); // L: 9918
						Client.packetWriter.addNode(var7); // L: 9919
					}

					if (var0 == 5) { // L: 9921
						var7 = class136.getPacketBufferNode(ClientPacket.field3072, Client.packetWriter.isaacCipher); // L: 9923
						var7.packetBuffer.method8536(var1); // L: 9924
						var7.packetBuffer.writeShort(var2); // L: 9925
						var7.packetBuffer.writeShort(var3); // L: 9926
						Client.packetWriter.addNode(var7); // L: 9927
					}

					if (var0 == 6) { // L: 9929
						var7 = class136.getPacketBufferNode(ClientPacket.field3098, Client.packetWriter.isaacCipher); // L: 9931
						var7.packetBuffer.method8536(var1); // L: 9932
						var7.packetBuffer.writeShort(var2); // L: 9933
						var7.packetBuffer.writeShort(var3); // L: 9934
						Client.packetWriter.addNode(var7); // L: 9935
					}

					if (var0 == 7) { // L: 9937
						var7 = class136.getPacketBufferNode(ClientPacket.field3079, Client.packetWriter.isaacCipher); // L: 9939
						var7.packetBuffer.method8536(var1); // L: 9940
						var7.packetBuffer.writeShort(var2); // L: 9941
						var7.packetBuffer.writeShort(var3); // L: 9942
						Client.packetWriter.addNode(var7); // L: 9943
					}

					if (var0 == 8) { // L: 9945
						var7 = class136.getPacketBufferNode(ClientPacket.field3074, Client.packetWriter.isaacCipher); // L: 9947
						var7.packetBuffer.method8536(var1); // L: 9948
						var7.packetBuffer.writeShort(var2); // L: 9949
						var7.packetBuffer.writeShort(var3); // L: 9950
						Client.packetWriter.addNode(var7); // L: 9951
					}

					if (var0 == 9) { // L: 9953
						var7 = class136.getPacketBufferNode(ClientPacket.field3076, Client.packetWriter.isaacCipher); // L: 9955
						var7.packetBuffer.method8536(var1); // L: 9956
						var7.packetBuffer.writeShort(var2); // L: 9957
						var7.packetBuffer.writeShort(var3); // L: 9958
						Client.packetWriter.addNode(var7); // L: 9959
					}

					if (var0 == 10) { // L: 9961
						var7 = class136.getPacketBufferNode(ClientPacket.field3081, Client.packetWriter.isaacCipher); // L: 9963
						var7.packetBuffer.method8536(var1); // L: 9964
						var7.packetBuffer.writeShort(var2); // L: 9965
						var7.packetBuffer.writeShort(var3); // L: 9966
						Client.packetWriter.addNode(var7); // L: 9967
					}

				}
			}
		}
	} // L: 9887 9969
}
