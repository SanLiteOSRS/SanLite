import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
public class class267 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "1959104088"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 123
		var2.size = var0.readUnsignedByte(); // L: 124
		var2.id = var0.readInt(); // L: 125
		var2.operations = new int[var2.size]; // L: 126
		var2.creationErrors = new int[var2.size]; // L: 127
		var2.fields = new Field[var2.size]; // L: 128
		var2.intReplaceValues = new int[var2.size]; // L: 129
		var2.methods = new Method[var2.size]; // L: 130
		var2.arguments = new byte[var2.size][][]; // L: 131

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 132
			try {
				int var4 = var0.readUnsignedByte(); // L: 134
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 135
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7]; // L: 149

						for (int var9 = 0; var9 < var7; ++var9) { // L: 150
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 151
						byte[][] var10 = new byte[var7][]; // L: 152
						int var12;
						if (var4 == 3) { // L: 153
							for (int var11 = 0; var11 < var7; ++var11) { // L: 154
								var12 = var0.readInt(); // L: 155
								var10[var11] = new byte[var12]; // L: 156
								var0.readBytes(var10[var11], 0, var12); // L: 157
							}
						}

						var2.operations[var3] = var4; // L: 160
						Class[] var21 = new Class[var7]; // L: 161

						for (var12 = 0; var12 < var7; ++var12) { // L: 162
							var21[var12] = AbstractWorldMapIcon.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = AbstractWorldMapIcon.loadClassFromDescriptor(var20); // L: 163
						if (AbstractWorldMapIcon.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = AbstractWorldMapIcon.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var17.length == var21.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var17[var19] != var21[var19]) { // L: 176
											var18 = false; // L: 177
											break; // L: 178
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 181
										var2.methods[var3] = var16; // L: 182
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 189
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 136
					var6 = var0.readStringCp1252NullTerminated(); // L: 137
					var7 = 0; // L: 138
					if (var4 == 1) { // L: 139
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 140
					var2.intReplaceValues[var3] = var7; // L: 141
					if (AbstractWorldMapIcon.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(AbstractWorldMapIcon.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3; // L: 199
			} catch (Exception var27) { // L: 201
				var2.creationErrors[var3] = -4; // L: 202
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1684171990"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 145
		int var2 = 0; // L: 146

		for (int var3 = 0; var3 < var1; ++var3) { // L: 147
			var2 = (var2 << 5) - var2 + class300.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 148
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1875245220"
	)
	static int method5148(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3863
			Nameable.Interpreter_intStackSize -= 2; // L: 3864
			Client.field561 = (short)class296.method5653(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]); // L: 3865
			if (Client.field561 <= 0) { // L: 3866
				Client.field561 = 256;
			}

			Client.field744 = (short)class296.method5653(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 3867
			if (Client.field744 <= 0) { // L: 3868
				Client.field744 = 256;
			}

			return 1; // L: 3869
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3871
			Nameable.Interpreter_intStackSize -= 2; // L: 3872
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3873
			if (Client.zoomHeight <= 0) { // L: 3874
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3875
			if (Client.zoomWidth <= 0) { // L: 3876
				Client.zoomWidth = 320;
			}

			return 1; // L: 3877
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3879
			Nameable.Interpreter_intStackSize -= 4; // L: 3880
			Client.field747 = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3881
			if (Client.field747 <= 0) { // L: 3882
				Client.field747 = 1;
			}

			Client.field748 = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3883
			if (Client.field748 <= 0) { // L: 3884
				Client.field748 = 32767;
			} else if (Client.field748 < Client.field747) { // L: 3885
				Client.field748 = Client.field747;
			}

			Client.field749 = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3886
			if (Client.field749 <= 0) { // L: 3887
				Client.field749 = 1;
			}

			Client.field724 = (short)Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 3888
			if (Client.field724 <= 0) { // L: 3889
				Client.field724 = 32767;
			} else if (Client.field724 < Client.field749) { // L: 3890
				Client.field724 = Client.field749;
			}

			return 1; // L: 3891
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3893
			if (Client.viewportWidget != null) { // L: 3894
				class134.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3895
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3896
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3897
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3900
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3901
			}

			return 1; // L: 3903
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3905
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3906
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3907
			return 1; // L: 3908
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3910
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendSystem.method1661(Client.field561); // L: 3911
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FriendSystem.method1661(Client.field744); // L: 3912
			return 1; // L: 3913
		} else if (var0 == 6220) { // L: 3915
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3916
			return 1; // L: 3917
		} else if (var0 == 6221) { // L: 3919
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3920
			return 1; // L: 3921
		} else if (var0 == 6222) { // L: 3923
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class7.canvasWidth; // L: 3924
			return 1; // L: 3925
		} else if (var0 == 6223) { // L: 3927
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = DecorativeObject.canvasHeight; // L: 3928
			return 1; // L: 3929
		} else {
			return 2; // L: 3931
		}
	}
}
