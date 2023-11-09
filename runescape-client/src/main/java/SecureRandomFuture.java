import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("aj")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("al")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "141845738"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2139546026"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1649323244"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return class392.method7406(); // L: 31
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmf;",
		garbageValue = "1229624350"
	)
	static GameBuild[] method2123() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC}; // L: 13
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lml;",
		garbageValue = "-8"
	)
	public static StudioGame[] method2124() {
		return new StudioGame[]{StudioGame.game5, StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game4, StudioGame.stellardawn}; // L: 17
	}
}
