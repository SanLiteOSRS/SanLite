import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ay")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("an")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-63"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-899066512"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-356451704"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)Ltt;",
		garbageValue = "860100351"
	)
	public static final SpritePixels method2112(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)Ljava/lang/String;",
		garbageValue = "-34"
	)
	public static String method2113(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 29
			if (var2 > 32767) { // L: 30
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 31
			var0.offset += class332.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 32
			String var4 = class149.decodeStringCp1252(var3, 0, var2); // L: 33
			var1 = var4; // L: 34
		} catch (Exception var6) { // L: 36
			var1 = "Cabbage"; // L: 37
		}

		return var1; // L: 40
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lco;",
		garbageValue = "-1399550661"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}
}
