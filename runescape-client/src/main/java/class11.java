import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("m")
public class class11 {
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 278389515
	)
	static int field108;
	@ObfuscatedName("gi")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1521848179
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 883989245
	)
	static int field106;
	@ObfuscatedName("o")
	boolean field77;
	@ObfuscatedName("u")
	boolean field104;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 4921630429052482837L
	)
	long field79;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1752668535
	)
	int field80;
	@ObfuscatedName("e")
	public String field81;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1200113713
	)
	int field82;
	@ObfuscatedName("g")
	public boolean field90;
	@ObfuscatedName("h")
	public byte field84;
	@ObfuscatedName("n")
	public byte field83;
	@ObfuscatedName("l")
	public byte field86;
	@ObfuscatedName("m")
	public byte field87;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2068831427
	)
	public int field88;
	@ObfuscatedName("c")
	long[] field89;
	@ObfuscatedName("j")
	public byte[] field76;
	@ObfuscatedName("r")
	int[] field91;
	@ObfuscatedName("q")
	int[] field92;
	@ObfuscatedName("t")
	public int[] field94;
	@ObfuscatedName("v")
	public boolean[] field78;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -813326745
	)
	public int field100;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1955278431
	)
	public int field96;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1976456997
	)
	public int field97;
	@ObfuscatedName("a")
	long[] field107;
	@ObfuscatedName("w")
	public String[] field99;
	@ObfuscatedName("s")
	public String[] field105;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lme;"
	)
	IterableNodeHashTable field95;

	@ObfuscatedSignature(
		signature = "(Lnu;)V"
	)
	public class11(Buffer var1) {
		this.field80 = 0;
		this.field81 = null;
		this.field82 = 0;
		this.field100 = -1;
		this.field96 = -1;
		this.method181(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1055386571"
	)
	void method140(int var1) {
		if (this.field77) {
			if (this.field89 != null) {
				System.arraycopy(this.field89, 0, this.field89 = new long[var1], 0, this.field88);
			} else {
				this.field89 = new long[var1];
			}
		}

		if (this.field104) {
			if (this.field99 != null) {
				System.arraycopy(this.field99, 0, this.field99 = new String[var1], 0, this.field88);
			} else {
				this.field99 = new String[var1];
			}
		}

		if (this.field76 != null) {
			System.arraycopy(this.field76, 0, this.field76 = new byte[var1], 0, this.field88);
		} else {
			this.field76 = new byte[var1];
		}

		if (this.field92 != null) {
			System.arraycopy(this.field92, 0, this.field92 = new int[var1], 0, this.field88);
		} else {
			this.field92 = new int[var1];
		}

		if (this.field94 != null) {
			System.arraycopy(this.field94, 0, this.field94 = new int[var1], 0, this.field88);
		} else {
			this.field94 = new int[var1];
		}

		if (this.field78 != null) {
			System.arraycopy(this.field78, 0, this.field78 = new boolean[var1], 0, this.field88);
		} else {
			this.field78 = new boolean[var1];
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "13"
	)
	void method175(int var1) {
		if (this.field77) {
			if (this.field107 != null) {
				System.arraycopy(this.field107, 0, this.field107 = new long[var1], 0, this.field97);
			} else {
				this.field107 = new long[var1];
			}
		}

		if (this.field104) {
			if (this.field105 != null) {
				System.arraycopy(this.field105, 0, this.field105 = new String[var1], 0, this.field97);
			} else {
				this.field105 = new String[var1];
			}
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)I",
		garbageValue = "-933779475"
	)
	public int method142(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.field88; ++var2) {
				if (this.field99[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "2138892447"
	)
	public int method143(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field92[var1] & var4) >>> var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IS)Ljava/lang/Integer;",
		garbageValue = "-30268"
	)
	public Integer method144(int var1) {
		if (this.field95 == null) {
			return null;
		} else {
			Node var2 = this.field95.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)[I",
		garbageValue = "645088980"
	)
	public int[] method159() {
		if (this.field91 == null) {
			String[] var1 = new String[this.field88];
			this.field91 = new int[this.field88];

			for (int var2 = 0; var2 < this.field88; this.field91[var2] = var2++) {
				var1[var2] = this.field99[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			int[] var3 = this.field91;
			GrandExchangeOffer.method4633(var1, var3, 0, var1.length - 1);
		}

		return this.field91;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(JLjava/lang/String;IB)V",
		garbageValue = "-16"
	)
	void method146(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field77) {
			throw new RuntimeException("");
		} else if (var3 != null != this.field104) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field89 == null || this.field88 >= this.field89.length) || var3 != null && (this.field99 == null || this.field88 >= this.field99.length)) {
				this.method140(this.field88 + 5);
			}

			if (this.field89 != null) {
				this.field89[this.field88] = var1;
			}

			if (this.field99 != null) {
				this.field99[this.field88] = var3;
			}

			if (this.field100 == -1) {
				this.field100 = this.field88;
				this.field76[this.field88] = 126;
			} else {
				this.field76[this.field88] = 0;
			}

			this.field92[this.field88] = 0;
			this.field94[this.field88] = var4;
			this.field78[this.field88] = false;
			++this.field88;
			this.field91 = null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-48"
	)
	void method147(int var1) {
		if (var1 >= 0 && var1 < this.field88) {
			--this.field88;
			this.field91 = null;
			if (this.field88 == 0) {
				this.field89 = null;
				this.field99 = null;
				this.field76 = null;
				this.field92 = null;
				this.field94 = null;
				this.field78 = null;
				this.field100 = -1;
				this.field96 = -1;
			} else {
				System.arraycopy(this.field76, var1 + 1, this.field76, var1, this.field88 - var1);
				System.arraycopy(this.field92, var1 + 1, this.field92, var1, this.field88 - var1);
				System.arraycopy(this.field94, var1 + 1, this.field94, var1, this.field88 - var1);
				System.arraycopy(this.field78, var1 + 1, this.field78, var1, this.field88 - var1);
				if (this.field89 != null) {
					System.arraycopy(this.field89, var1 + 1, this.field89, var1, this.field88 - var1);
				}

				if (this.field99 != null) {
					System.arraycopy(this.field99, var1 + 1, this.field99, var1, this.field88 - var1);
				}

				this.method164();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	void method164() {
		if (this.field88 == 0) {
			this.field100 = -1;
			this.field96 = -1;
		} else {
			this.field100 = -1;
			this.field96 = -1;
			int var1 = 0;
			byte var2 = this.field76[0];

			for (int var3 = 1; var3 < this.field88; ++var3) {
				if (this.field76[var3] > var2) {
					if (var2 == 125) {
						this.field96 = var1;
					}

					var1 = var3;
					var2 = this.field76[var3];
				} else if (this.field96 == -1 && this.field76[var3] == 125) {
					this.field96 = var3;
				}
			}

			this.field100 = var1;
			if (this.field100 != -1) {
				this.field76[this.field100] = 126;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(JLjava/lang/String;I)V",
		garbageValue = "2100738609"
	)
	void method188(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.field77) {
			throw new RuntimeException("");
		} else if (this.field104 != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.field107 == null || this.field97 >= this.field107.length) || var3 != null && (this.field105 == null || this.field97 >= this.field105.length)) {
				this.method175(this.field97 + 5);
			}

			if (this.field107 != null) {
				this.field107[this.field97] = var1;
			}

			if (this.field105 != null) {
				this.field105[this.field97] = var3;
			}

			++this.field97;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-123"
	)
	void method180(int var1) {
		--this.field97;
		if (this.field97 == 0) {
			this.field107 = null;
			this.field105 = null;
		} else {
			if (this.field107 != null) {
				System.arraycopy(this.field107, var1 + 1, this.field107, var1, this.field97 - var1);
			}

			if (this.field105 != null) {
				System.arraycopy(this.field105, var1 + 1, this.field105, var1, this.field97 - var1);
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IBB)I",
		garbageValue = "-51"
	)
	int method151(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.field100 == var1 && (this.field96 == -1 || this.field76[this.field96] < 125)) {
				return -1;
			} else if (this.field76[var1] == var2) {
				return -1;
			} else {
				this.field76[var1] = var2;
				this.method164();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-243833615"
	)
	boolean method190(int var1) {
		if (this.field100 != var1 && this.field76[var1] != 126) {
			this.field76[this.field100] = 125;
			this.field96 = this.field100;
			this.field76[var1] = 126;
			this.field100 = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IZI)I",
		garbageValue = "-1814028575"
	)
	int method153(int var1, boolean var2) {
		if (this.field78[var1] == var2) {
			return -1;
		} else {
			this.field78[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIIII)I",
		garbageValue = "-110007630"
	)
	int method154(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field92[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field92[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-418167741"
	)
	boolean method178(int var1, int var2) {
		if (this.field95 != null) {
			Node var3 = this.field95.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.field95 = new IterableNodeHashTable(4);
		}

		this.field95.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIIIB)Z",
		garbageValue = "92"
	)
	boolean method156(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.field95 != null) {
			Node var8 = this.field95.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.field95 = new IterableNodeHashTable(4);
		}

		this.field95.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("t")
	boolean method157(int var1, long var2) {
		if (this.field95 != null) {
			Node var4 = this.field95.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class348) {
					class348 var5 = (class348)var4;
					if (var5.field3938 == var2) {
						return false;
					}

					var5.field3938 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.field95 = new IterableNodeHashTable(4);
		}

		this.field95.put(new class348(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)Z",
		garbageValue = "-222016163"
	)
	boolean method158(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.field95 != null) {
			Node var3 = this.field95.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.field95.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.field95 = new IterableNodeHashTable(4);
		}

		this.field95.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "495563881"
	)
	void method181(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.field77 = true;
			}

			if ((var3 & 2) != 0) {
				this.field104 = true;
			}

			if (!this.field77) {
				this.field89 = null;
				this.field107 = null;
			}

			if (!this.field104) {
				this.field99 = null;
				this.field105 = null;
			}

			this.field80 = var1.readInt();
			this.field82 = var1.readInt();
			if (var2 <= 3 && this.field82 != 0) {
				this.field82 += 16912800;
			}

			this.field88 = var1.readUnsignedShort();
			this.field97 = var1.readUnsignedByte();
			this.field81 = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.field90 = var1.readUnsignedByte() == 1;
			this.field84 = var1.readByte();
			this.field83 = var1.readByte();
			this.field86 = var1.readByte();
			this.field87 = var1.readByte();
			int var4;
			if (this.field88 > 0) {
				if (this.field77 && (this.field89 == null || this.field89.length < this.field88)) {
					this.field89 = new long[this.field88];
				}

				if (this.field104 && (this.field99 == null || this.field99.length < this.field88)) {
					this.field99 = new String[this.field88];
				}

				if (this.field76 == null || this.field76.length < this.field88) {
					this.field76 = new byte[this.field88];
				}

				if (this.field92 == null || this.field92.length < this.field88) {
					this.field92 = new int[this.field88];
				}

				if (this.field94 == null || this.field94.length < this.field88) {
					this.field94 = new int[this.field88];
				}

				if (this.field78 == null || this.field78.length < this.field88) {
					this.field78 = new boolean[this.field88];
				}

				for (var4 = 0; var4 < this.field88; ++var4) {
					if (this.field77) {
						this.field89[var4] = var1.readLong();
					}

					if (this.field104) {
						this.field99[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.field76[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field92[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field94[var4] = var1.readUnsignedShort();
					} else {
						this.field94[var4] = 0;
					}

					if (var2 >= 6) {
						this.field78[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field78[var4] = false;
					}
				}

				this.method164();
			}

			if (this.field97 > 0) {
				if (this.field77 && (this.field107 == null || this.field107.length < this.field97)) {
					this.field107 = new long[this.field97];
				}

				if (this.field104 && (this.field105 == null || this.field105.length < this.field97)) {
					this.field105 = new String[this.field97];
				}

				for (var4 = 0; var4 < this.field97; ++var4) {
					if (this.field77) {
						this.field107[var4] = var1.readLong();
					}

					if (this.field104) {
						this.field105[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					int var5;
					int var6;
					int var7;
					if (var4 < 16) {
						var7 = var4 - 1;
						var7 |= var7 >>> 1;
						var7 |= var7 >>> 2;
						var7 |= var7 >>> 4;
						var7 |= var7 >>> 8;
						var7 |= var7 >>> 16;
						var6 = var7 + 1;
						var5 = var6;
					} else {
						var5 = 16;
					}

					this.field95 = new IterableNodeHashTable(var5);

					while (var4-- > 0) {
						var6 = var1.readInt();
						var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var9 = var1.readInt();
							this.field95.put(new IntegerNode(var9), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.readLong();
							this.field95.put(new class348(var11), (long)var7);
						} else if (var8 == 2) {
							String var13 = var1.readStringCp1252NullTerminated();
							this.field95.put(new ObjectNode(var13), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("f")
	public static String method196(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class304.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnk;B)V",
		garbageValue = "37"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnk;II)V",
		garbageValue = "-1263790804"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var5;
		int var6;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var5 = Players.Players_indices[var4];
			if ((Players.field1350[var5] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1350;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = class264.method4680(var0);
						var10000 = Players.field1350;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						MenuAction.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var5 = Players.Players_indices[var4];
				if ((Players.field1350[var5] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1350;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = class264.method4680(var0);
							var10000 = Players.field1350;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							MenuAction.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var5 = Players.Players_emptyIndices[var4];
					if ((Players.field1350[var5] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1350;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = class264.method4680(var0);
								var10000 = Players.field1350;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (WorldMapDecoration.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1350;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var5 = Players.Players_emptyIndices[var4];
						if ((Players.field1350[var5] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1350;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = class264.method4680(var0);
									var10000 = Players.field1350;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (WorldMapDecoration.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1350;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1350;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var7 = Client.players[var4];
							if (var7 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						PcmPlayer.method857(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "80"
	)
	static final void method205(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		class69.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		signature = "(Lhu;B)Ljava/lang/String;",
		garbageValue = "-44"
	)
	static String method199(Widget var0) {
		if (class223.method4231(DirectByteArrayCopier.getWidgetClickMask(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
