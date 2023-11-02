import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class7 {
	@ObfuscatedName("ac")
	ExecutorService field25;
	@ObfuscatedName("al")
	Future field23;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final Buffer field24;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class3 field22;

	@ObfuscatedSignature(
		descriptor = "(Lul;Lax;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor(); // L: 10
		this.field24 = var1; // L: 16
		this.field22 = var2; // L: 17
		this.method47(); // L: 18
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method44() {
		return this.field23.isDone(); // L: 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	public void method45() {
		this.field25.shutdown(); // L: 26
		this.field25 = null; // L: 27
	} // L: 28

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lul;",
		garbageValue = "1362565755"
	)
	public Buffer method46() {
		try {
			return (Buffer)this.field23.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-693034688"
	)
	void method47() {
		this.field23 = this.field25.submit(new class1(this, this.field24, this.field22));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-20434766"
	)
	static long method43() {
		try {
			URL var0 = new URL(ScriptEvent.method2315("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1063387188"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		CollisionMap.method4301(); // L: 2947
		switch(var0) { // L: 2948
		case 1:
			GameEngine.method647(24); // L: 2957
			AbstractWorldMapIcon.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2958
			break;
		case 2:
			class339.method6258(); // L: 2951
		}

	} // L: 2963

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)Lpf;",
		garbageValue = "2097624965"
	)
	public static NodeDeque method58() {
		return Client.scriptEvents; // L: 5357
	}
}
