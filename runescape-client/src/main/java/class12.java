import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("al")
class class12 extends SSLSocket {
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 301817627
	)
	static int field58;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 457066205
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("mouseWheel")
	static class174 mouseWheel;
	@ObfuscatedName("au")
	Certificate[] field63;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lab;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1596734724"
	)
	static int method151(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1075
		Widget var4;
		if (var0 >= 2000) { // L: 1077
			var0 -= 1000; // L: 1078
			var4 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1079
			var3 = false; // L: 1080
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1082
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1083
			var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] - 1; // L: 1084
			if (var11 >= 0 && var11 <= 9) { // L: 1085
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]); // L: 1089
				return 1; // L: 1090
			} else {
				--class137.Interpreter_stringStackSize; // L: 1086
				return 1; // L: 1087
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1092
				SoundCache.Interpreter_intStackSize -= 2; // L: 1093
				var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1094
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1095
				var4.parent = SoundCache.getWidgetChild(var11, var6); // L: 1096
				return 1; // L: 1097
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1099
				var4.isScrollBar = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1100
				return 1; // L: 1101
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1103
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1104
				return 1; // L: 1105
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1107
				var4.dragThreshold = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1108
				return 1; // L: 1109
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1111
				var4.dataText = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1112
				return 1; // L: 1113
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1115
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1116
				return 1; // L: 1117
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1119
				var4.actions = null; // L: 1120
				return 1; // L: 1121
			} else if (var0 == 1308) { // L: 1123
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1124
				return 1; // L: 1125
			} else if (var0 == 1309) { // L: 1127
				--SoundCache.Interpreter_intStackSize; // L: 1128
				return 1; // L: 1129
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1131
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1161
						SoundCache.Interpreter_intStackSize -= 2; // L: 1162
						var5 = 10; // L: 1163
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]}; // L: 1164
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]}; // L: 1165
						WorldMap.Widget_setKey(var4, var5, var8, var9); // L: 1166
						return 1; // L: 1167
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1169
						SoundCache.Interpreter_intStackSize -= 3; // L: 1170
						var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] - 1; // L: 1171
						var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1172
						var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 1173
						if (var11 >= 0 && var11 <= 9) { // L: 1174
							class126.Widget_setKeyRate(var4, var11, var6, var7); // L: 1177
							return 1; // L: 1178
						} else {
							throw new RuntimeException(); // L: 1175
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1180
						var5 = 10; // L: 1181
						var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1182
						var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1183
						class126.Widget_setKeyRate(var4, var5, var6, var7); // L: 1184
						return 1; // L: 1185
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1187
						--SoundCache.Interpreter_intStackSize; // L: 1188
						var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] - 1; // L: 1189
						if (var11 >= 0 && var11 <= 9) { // L: 1190
							ArchiveLoader.Widget_setKeyIgnoreHeld(var4, var11); // L: 1193
							return 1; // L: 1194
						} else {
							throw new RuntimeException(); // L: 1191
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1196
						var5 = 10; // L: 1197
						ArchiveLoader.Widget_setKeyIgnoreHeld(var4, var5); // L: 1198
						return 1; // L: 1199
					} else {
						return 2; // L: 1201
					}
				} else {
					byte[] var10 = null; // L: 1132
					var8 = null; // L: 1133
					if (var3) { // L: 1134
						SoundCache.Interpreter_intStackSize -= 10; // L: 1135

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1137 1138
						}

						if (var7 > 0) { // L: 1140
							var10 = new byte[var7 / 2]; // L: 1141
							var8 = new byte[var7 / 2]; // L: 1142

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1143
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize]; // L: 1144
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize + 1]; // L: 1145
							}
						}
					} else {
						SoundCache.Interpreter_intStackSize -= 2; // L: 1150
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]}; // L: 1151
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]}; // L: 1152
					}

					var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] - 1; // L: 1154
					if (var7 >= 0 && var7 <= 9) { // L: 1155
						WorldMap.Widget_setKey(var4, var7, var10, var8); // L: 1158
						return 1; // L: 1159
					} else {
						throw new RuntimeException(); // L: 1156
					}
				}
			}
		}
	}
}
