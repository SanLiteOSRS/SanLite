import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class35 {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		signature = "Ljh;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("f")
	ExecutorService field239;
	@ObfuscatedName("o")
	Future field238;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	final Buffer field237;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	final class31 field240;

	@ObfuscatedSignature(
		signature = "(Lnu;Lat;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field239 = Executors.newSingleThreadExecutor();
		this.field237 = var1;
		this.field240 = var2;
		this.method432();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1164318842"
	)
	public boolean method426() {
		return this.field238.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	public void method427() {
		this.field239.shutdown();
		this.field239 = null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)Lnu;",
		garbageValue = "-112"
	)
	public Buffer method425() {
		try {
			return (Buffer)this.field238.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-993058043"
	)
	void method432() {
		this.field238 = this.field239.submit(new class29(this, this.field237, this.field240));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "26"
	)
	static final void method435() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own ignore list";
		class69.addGameMessage(30, "", var0);
	}
}
