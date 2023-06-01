import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class368 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class368 field4350;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class368 field4349;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class368 field4348;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static final class368 field4351;

	static {
		field4350 = new class368(); // L: 4
		field4349 = new class368(); // L: 5
		field4348 = new class368(); // L: 6
		field4351 = new class368(); // L: 7
	}

	class368() {
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lqt;",
		garbageValue = "-1469369840"
	)
	public static AbstractSocket method6922(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}
}
