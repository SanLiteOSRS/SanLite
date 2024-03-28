import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ag")
	public static short[][] field1454;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1452;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1555622417
	)
	static int field1453;
	@ObfuscatedName("az")
	final Thread field1455;
	@ObfuscatedName("ah")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("af")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1698107757
	)
	int field1448;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1455 = new Thread(this); // L: 21
		this.field1455.setPriority(1); // L: 22
		this.field1455.start(); // L: 23
		this.field1448 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1625450923"
	)
	abstract void vmethod2837(UrlRequest var1) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "1958691031"
	)
	int method2804(URLConnection var1) {
		int var2 = UrlRequest.field1464; // L: 53
		if (var1 != null) { // L: 54
			try {
				if (var1 instanceof HttpURLConnection) { // L: 56
					var2 = ((HttpURLConnection)var1).getResponseCode(); // L: 57
				}
			} catch (IOException var4) { // L: 60
			}
		}

		return var2; // L: 62
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-383350647"
	)
	void method2805(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1448); // L: 70
	} // L: 71

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lel;B)V",
		garbageValue = "-45"
	)
	void method2806(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 74

		try {
			int var5 = var1.getContentLength(); // L: 77
			var3 = new DataInputStream(var1.getInputStream()); // L: 78
			byte[] var4;
			if (var5 >= 0) { // L: 79
				var4 = new byte[var5]; // L: 80
				var3.readFully(var4); // L: 81
			} else {
				var4 = new byte[0]; // L: 84
				byte[] var6 = class195.ByteArrayPool_getArray(5000); // L: 85

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) { // L: 86 87 92
					byte[] var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
					var4 = var8; // L: 91
				}

				WorldMapIcon_0.ByteArrayPool_release(var6); // L: 94
			}

			var2.response0 = var4; // L: 96
		} catch (IOException var14) { // L: 98
			var2.response0 = null; // L: 99
		} finally {
			var2.field1465 = this.method2804(var1); // L: 102
		}

		if (var3 != null) { // L: 104
			try {
				var3.close(); // L: 106
			} catch (IOException var13) { // L: 108
			}
		}

	} // L: 110

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lel;",
		garbageValue = "73"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 113
		synchronized(this) { // L: 114
			this.requests.add(var2); // L: 115
			this.notify(); // L: 116
			return var2; // L: 118
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 122

		try {
			synchronized(this) { // L: 124
				this.notify(); // L: 125
			} // L: 126

			this.field1455.join(); // L: 127
		} catch (InterruptedException var4) { // L: 129
		}

	} // L: 130

	public void run() {
		while (!this.isClosed) { // L: 29
			try {
				UrlRequest var1;
				synchronized(this) { // L: 32
					var1 = (UrlRequest)this.requests.poll(); // L: 33
					if (var1 == null) { // L: 34
						try {
							this.wait(); // L: 36
						} catch (InterruptedException var5) { // L: 38
						}
						continue;
					}
				}

				this.vmethod2837(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class180.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-481908362"
	)
	static int method2833(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1047
			var0 -= 1000; // L: 1048
			var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1049
		} else {
			var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1051
		}

		WorldMapData_0.invalidateWidget(var3); // L: 1052
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1053
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1073
				var3.modelType = 2; // L: 1074
				var3.modelId = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1075
				return 1; // L: 1076
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1078
				var3.modelType = 3; // L: 1079
				var3.modelId = class133.localPlayer.appearance.getChatHeadId(); // L: 1080
				return 1; // L: 1081
			} else if (var0 == 1207) { // L: 1083
				boolean var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 1084
				ChatChannel.method2212(var3, class133.localPlayer.appearance, var7); // L: 1085
				return 1; // L: 1086
			} else if (var0 == 1208) { // L: 1088
				var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1089
				if (var3.field3801 == null) { // L: 1090
					throw new RuntimeException(""); // L: 1091
				} else {
					Actor.method2413(var3, var4); // L: 1093
					return 1; // L: 1094
				}
			} else if (var0 == 1209) { // L: 1096
				class19.Interpreter_intStackSize -= 2; // L: 1097
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1098
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1099
				if (var3.field3801 == null) { // L: 1100
					throw new RuntimeException(""); // L: 1101
				} else {
					HorizontalAlignment.method3854(var3, var4, var5); // L: 1103
					return 1; // L: 1104
				}
			} else if (var0 == 1210) { // L: 1106
				var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1107
				if (var3.field3801 == null) { // L: 1108
					throw new RuntimeException(""); // L: 1109
				} else {
					PacketBufferNode.method5921(var3, class133.localPlayer.appearance.field3686, var4); // L: 1111
					return 1; // L: 1112
				}
			} else {
				return 2; // L: 1114
			}
		} else {
			class19.Interpreter_intStackSize -= 2; // L: 1054
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1055
			var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1056
			var3.itemId = var4; // L: 1057
			var3.itemQuantity = var5; // L: 1058
			ItemComposition var6 = class10.ItemComposition_get(var4); // L: 1059
			var3.modelAngleX = var6.xan2d; // L: 1060
			var3.modelAngleY = var6.yan2d; // L: 1061
			var3.modelAngleZ = var6.zan2d; // L: 1062
			var3.modelOffsetX = var6.offsetX2d; // L: 1063
			var3.modelOffsetY = var6.offsetY2d; // L: 1064
			var3.modelZoom = var6.zoom2d; // L: 1065
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1066
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1067
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1068
			}

			if (var3.field3799 > 0) { // L: 1069
				var3.modelZoom = var3.modelZoom * 32 / var3.field3799;
			} else if (var3.rawWidth > 0) { // L: 1070
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1071
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-747589187"
	)
	static int method2831(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2913
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2914
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field748.method4318(var3) ? 1 : 0; // L: 2915
			return 1; // L: 2916
		} else if (var0 == 3501) { // L: 2918
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2919
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field748.method4333(var3) ? 1 : 0; // L: 2920
			return 1; // L: 2921
		} else if (var0 == 3502) { // L: 2923
			var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2924
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field748.method4319(var3) ? 1 : 0; // L: 2925
			return 1; // L: 2926
		} else {
			return 2; // L: 2928
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldv;",
		garbageValue = "44"
	)
	static final InterfaceParent method2832(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12541
		var3.group = var1; // L: 12542
		var3.type = var2; // L: 12543
		Client.interfaceParents.put(var3, (long)var0); // L: 12544
		ApproximateRouteStrategy.method1186(var1); // L: 12545
		Widget var4 = class243.field2620.method6281(var0); // L: 12546
		WorldMapData_0.invalidateWidget(var4); // L: 12547
		if (Client.meslayerContinueWidget != null) { // L: 12548
			WorldMapData_0.invalidateWidget(Client.meslayerContinueWidget); // L: 12549
			Client.meslayerContinueWidget = null; // L: 12550
		}

		IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var0 >> 16], var4, false); // L: 12552
		class25.method338(var1); // L: 12553
		if (Client.rootInterface != -1) { // L: 12554
			Login.method2161(Client.rootInterface, 1);
		}

		return var3; // L: 12555
	}
}
