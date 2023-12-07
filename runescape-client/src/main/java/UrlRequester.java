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

@ObfuscatedName("el")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("at")
	final Thread field1418;
	@ObfuscatedName("ah")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ar")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -108410615
	)
	int field1419;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1418 = new Thread(this); // L: 21
		this.field1418.setPriority(1); // L: 22
		this.field1418.start(); // L: 23
		this.field1419 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "422697771"
	)
	abstract void vmethod2910(UrlRequest var1) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "117"
	)
	int method2888(URLConnection var1) {
		int var2 = UrlRequest.field1432; // L: 53
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-727405176"
	)
	void method2905(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1419); // L: 70
	} // L: 71

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lea;I)V",
		garbageValue = "-1518278388"
	)
	void method2890(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = class362.ByteArrayPool_getArray(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				class412.ByteArrayPool_release(var6); // L: 94
			}

			var2.response0 = var4;
		} catch (IOException var14) { // L: 98
			var2.response0 = null; // L: 99
		} finally {
			var2.field1427 = this.method2888(var1); // L: 102
		}

		if (var3 != null) { // L: 104
			try {
				var3.close(); // L: 106
			} catch (IOException var13) { // L: 108
			}
		}

	} // L: 110

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lea;",
		garbageValue = "-511964616"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-264971545"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 122

		try {
			synchronized(this) { // L: 124
				this.notify(); // L: 125
			} // L: 126

			this.field1418.join(); // L: 127
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

				this.vmethod2910(var1); // L: 42
			} catch (Exception var7) { // L: 44
				GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILhs;II)V",
		garbageValue = "237436184"
	)
	static void method2900(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 74
		var5.plane = var0; // L: 75
		var5.x = var1 * 128; // L: 76
		var5.y = var2 * 128; // L: 77
		int var6 = var3.sizeX; // L: 78
		int var7 = var3.sizeY; // L: 79
		if (var4 == 1 || var4 == 3) { // L: 80
			var6 = var3.sizeY; // L: 81
			var7 = var3.sizeX; // L: 82
		}

		var5.maxX = (var6 + var1) * 16384; // L: 84
		var5.maxY = (var7 + var2) * 128; // L: 85
		var5.soundEffectId = var3.ambientSoundId; // L: 86
		var5.field824 = var3.int7 * 128; // L: 87
		var5.field827 = var3.int5; // L: 88
		var5.field828 = var3.int6; // L: 89
		var5.soundEffectIds = var3.soundEffectIds; // L: 90
		if (var3.transforms != null) { // L: 91
			var5.obj = var3; // L: 92
			var5.set(); // L: 93
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 95
		if (var5.soundEffectIds != null) { // L: 96
			var5.field832 = var5.field827 + (int)(Math.random() * (double)(var5.field828 - var5.field827));
		}

	} // L: 97

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "-175"
	)
	static int method2901(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1871
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1872
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapData_0.Widget_unpackTargetMask(class361.getWidgetFlags(var3)); // L: 1873
			return 1; // L: 1874
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1876
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1883
				if (var3.dataText == null) { // L: 1884
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1885
				}

				return 1; // L: 1886
			} else {
				return 2; // L: 1888
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1877
			--var4; // L: 1878
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1879
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1880
			} else {
				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1881
		}
	}
}
