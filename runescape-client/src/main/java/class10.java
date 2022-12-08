import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
public class class10 {
	@ObfuscatedName("h")
	HttpsURLConnection field53;
	@ObfuscatedName("e")
	final Map field49;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	class421 field50;
	@ObfuscatedName("x")
	Map field57;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	final class9 field48;
	@ObfuscatedName("q")
	boolean field51;
	@ObfuscatedName("f")
	boolean field54;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 315851455
	)
	int field55;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lb;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field51 = false; // L: 20
		this.field54 = false; // L: 21
		this.field55 = 300000; // L: 22
		if (!var2.method69()) { // L: 25
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
		} else {
			this.field53 = (HttpsURLConnection)var1.openConnection(); // L: 26
			if (!var3) { // L: 27
				HttpsURLConnection var4 = this.field53; // L: 28
				if (class15.field90 == null) { // L: 31
					class15.field90 = new class15(); // L: 32
				}

				class15 var5 = class15.field90; // L: 34
				var4.setSSLSocketFactory(var5); // L: 36
			}

			this.field48 = var2; // L: 38
			this.field49 = new HashMap(); // L: 39
			this.field57 = new HashMap(); // L: 40
		}
	} // L: 41

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-825590030"
	)
	public void method86(String var1, String var2) {
		if (!this.field51) { // L: 44
			this.field49.put(var1, var2); // L: 45
		}
	} // L: 46

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-953268261"
	)
	String method84() {
		ArrayList var1 = new ArrayList(this.field57.entrySet()); // L: 49
		Collections.sort(var1, new class18(this)); // L: 50
		StringBuilder var2 = new StringBuilder(); // L: 63
		Iterator var3 = var1.iterator(); // L: 64

		while (var3.hasNext()) { // L: 75
			Entry var4 = (Entry)var3.next(); // L: 65
			if (var2.length() > 0) { // L: 67
				var2.append(",");
			}

			var2.append(((class420)var4.getKey()).method7905()); // L: 68
			float var5 = (Float)var4.getValue(); // L: 69
			if (var5 < 1.0F) { // L: 70
				String var6 = Float.toString(var5).substring(0, 4); // L: 71
				var2.append(";q=" + var6); // L: 72
			}
		}

		return var2.toString(); // L: 76
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1499670769"
	)
	void method87() throws ProtocolException {
		if (!this.field51) { // L: 80
			this.field53.setRequestMethod(this.field48.method70()); // L: 81
			if (!this.field57.isEmpty()) { // L: 82
				this.field49.put("Accept", this.method84());
			}

			Iterator var1 = this.field49.entrySet().iterator(); // L: 83

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 84
				this.field53.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 86
			}

			if (this.field48.method71() && this.field50 != null) { // L: 89
				this.field53.setDoOutput(true); // L: 90
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 91

				try {
					var13.write(this.field50.vmethod7924()); // L: 93
					var13.writeTo(this.field53.getOutputStream()); // L: 94
				} catch (IOException var11) { // L: 96
					var11.printStackTrace(); // L: 97
				} finally {
					if (var13 != null) { // L: 100
						try {
							var13.close(); // L: 102
						} catch (IOException var10) { // L: 104
							var10.printStackTrace(); // L: 105
						}
					}

				}
			}

			this.field53.setConnectTimeout(this.field55); // L: 110
			this.field53.setInstanceFollowRedirects(this.field54); // L: 111
			this.field51 = true; // L: 112
		}
	} // L: 113

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "71873329"
	)
	boolean method88() throws IOException, SocketTimeoutException {
		if (!this.field51) { // L: 116
			this.method87();
		}

		this.field53.connect(); // L: 117
		return this.field53.getResponseCode() == -1; // L: 118
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lp;",
		garbageValue = "39"
	)
	class21 method89() {
		try {
			if (!this.field51 || this.field53.getResponseCode() == -1) { // L: 124
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 126
			this.field53.disconnect(); // L: 127
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 128
		}

		class21 var1 = null; // L: 130

		class21 var3;
		try {
			var1 = new class21(this.field53); // L: 132
			return var1; // L: 140
		} catch (IOException var8) { // L: 134
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 135
		} finally {
			this.field53.disconnect(); // L: 138
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-609690388"
	)
	static int method100(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4231
			class87.Interpreter_intStackSize -= 2; // L: 4232
			Client.field778 = (short)AttackOption.method2610(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]); // L: 4233
			if (Client.field778 <= 0) { // L: 4234
				Client.field778 = 256;
			}

			Client.field550 = (short)AttackOption.method2610(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 4235
			if (Client.field550 <= 0) { // L: 4236
				Client.field550 = 256;
			}

			return 1; // L: 4237
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4239
			class87.Interpreter_intStackSize -= 2; // L: 4240
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4241
			if (Client.zoomHeight <= 0) { // L: 4242
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4243
			if (Client.zoomWidth <= 0) { // L: 4244
				Client.zoomWidth = 320;
			}

			return 1; // L: 4245
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4247
			class87.Interpreter_intStackSize -= 4; // L: 4248
			Client.field690 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4249
			if (Client.field690 <= 0) { // L: 4250
				Client.field690 = 1;
			}

			Client.field783 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4251
			if (Client.field783 <= 0) { // L: 4252
				Client.field783 = 32767;
			} else if (Client.field783 < Client.field690) { // L: 4253
				Client.field783 = Client.field690;
			}

			Client.field784 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 4254
			if (Client.field784 <= 0) { // L: 4255
				Client.field784 = 1;
			}

			Client.field510 = (short)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 4256
			if (Client.field510 <= 0) { // L: 4257
				Client.field510 = 32767;
			} else if (Client.field510 < Client.field784) { // L: 4258
				Client.field510 = Client.field784;
			}

			return 1; // L: 4259
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4261
			if (Client.viewportWidget != null) { // L: 4262
				class143.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4263
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4264
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4265
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4268
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4269
			}

			return 1; // L: 4271
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4273
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4274
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4275
			return 1; // L: 4276
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4278
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeEvents.method6569(Client.field778); // L: 4279
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeEvents.method6569(Client.field550); // L: 4280
			return 1; // L: 4281
		} else if (var0 == 6220) { // L: 4283
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4284
			return 1; // L: 4285
		} else if (var0 == 6221) { // L: 4287
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4288
			return 1; // L: 4289
		} else if (var0 == 6222) { // L: 4291
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = CollisionMap.canvasWidth; // L: 4292
			return 1; // L: 4293
		} else if (var0 == 6223) { // L: 4295
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Language.canvasHeight; // L: 4296
			return 1; // L: 4297
		} else {
			return 2; // L: 4299
		}
	}
}
