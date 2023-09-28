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
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("lt")
public class class305 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field3128;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	static TextureProvider field3129;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)V",
		garbageValue = "52"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 25
		if (var1 != null) { // L: 26
			int var2 = var0.offset; // L: 27
			var0.writeInt(var1.id); // L: 28

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
							var0.writeInt(var6); // L: 40
						} else if (var4 == 1) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 44
							var0.writeByte(0); // L: 45
						} else if (var4 == 2) { // L: 47
							var5 = var1.fields[var3]; // L: 48
							var6 = var5.getModifiers(); // L: 49
							var0.writeByte(0); // L: 50
							var0.writeInt(var6); // L: 51
						}

						Method var25;
						if (var4 != 3) { // L: 53
							if (var4 == 4) { // L: 73
								var25 = var1.methods[var3]; // L: 74
								var6 = var25.getModifiers(); // L: 75
								var0.writeByte(0); // L: 76
								var0.writeInt(var6); // L: 77
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

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIIIIII)V",
		garbageValue = "-754549131"
	)
	static final void method5862(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field582) { // L: 11201
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11202
		}

		Client.field582 = false; // L: 11203
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11204
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11205
				var0.scrollY -= 4; // L: 11206
				ClanChannelMember.invalidateWidget(var0); // L: 11207
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11209
				var0.scrollY += 4; // L: 11210
				ClanChannelMember.invalidateWidget(var0); // L: 11211
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11213
				var7 = var3 * (var3 - 32) / var4; // L: 11214
				if (var7 < 8) { // L: 11215
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11216
				int var9 = var3 - 32 - var7; // L: 11217
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11218
				ClanChannelMember.invalidateWidget(var0); // L: 11219
				Client.field582 = true; // L: 11220
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11223
			var7 = var0.width; // L: 11224
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11225
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11226
				ClanChannelMember.invalidateWidget(var0); // L: 11227
			}
		}

	} // L: 11230
}
