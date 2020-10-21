import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("z")
	int field1506;
	@ObfuscatedName("k")
	int field1492;
	@ObfuscatedName("s")
	int field1494;
	@ObfuscatedName("t")
	int field1503;
	@ObfuscatedName("i")
	int field1493;
	@ObfuscatedName("o")
	int field1497;
	@ObfuscatedName("x")
	int field1498;
	@ObfuscatedName("g")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("m")
	@Export("start")
	int start;
	@ObfuscatedName("n")
	@Export("end")
	int end;
	@ObfuscatedName("d")
	boolean field1502;
	@ObfuscatedName("h")
	int field1496;
	@ObfuscatedName("a")
	int field1504;
	@ObfuscatedName("q")
	int field1505;
	@ObfuscatedName("c")
	int field1500;

	@ObfuscatedSignature(
		signature = "(Lde;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1502 = var1.field1417;
		this.field1492 = var2;
		this.field1494 = var3;
		this.field1503 = var4;
		this.field1506 = 0;
		this.method2647();
	}

	@ObfuscatedSignature(
		signature = "(Lde;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1502 = var1.field1417;
		this.field1492 = var2;
		this.field1494 = var3;
		this.field1503 = 8192;
		this.field1506 = 0;
		this.method2647();
	}

	@ObfuscatedName("i")
	void method2647() {
		this.field1493 = this.field1494;
		this.field1497 = method2733(this.field1494, this.field1503);
		this.field1498 = method2768(this.field1494, this.field1503);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected int vmethod3987() {
		return this.field1494 == 0 && this.field1496 == 0 ? 0 : 1;
	}

	@ObfuscatedName("g")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1494 == 0 && this.field1496 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field1506 < 0) {
				if (this.field1492 <= 0) {
					this.method2648();
					this.remove();
					return;
				}

				this.field1506 = 0;
			}

			if (this.field1506 >= var7) {
				if (this.field1492 >= 0) {
					this.method2648();
					this.remove();
					return;
				}

				this.field1506 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1502) {
					if (this.field1492 < 0) {
						var9 = this.method2664(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1506 >= var5) {
							return;
						}

						this.field1506 = var5 + var5 - 1 - this.field1506;
						this.field1492 = -this.field1492;
					}

					while (true) {
						var9 = this.method2662(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1506 < var6) {
							return;
						}

						this.field1506 = var6 + var6 - 1 - this.field1506;
						this.field1492 = -this.field1492;
						var9 = this.method2664(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1506 >= var5) {
							return;
						}

						this.field1506 = var5 + var5 - 1 - this.field1506;
						this.field1492 = -this.field1492;
					}
				} else if (this.field1492 < 0) {
					while (true) {
						var9 = this.method2664(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1506 >= var5) {
							return;
						}

						this.field1506 = var6 - 1 - (var6 - 1 - this.field1506) % var8;
					}
				} else {
					while (true) {
						var9 = this.method2662(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1506 < var6) {
							return;
						}

						this.field1506 = var5 + (this.field1506 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1502) {
						label136: {
							if (this.field1492 < 0) {
								var9 = this.method2664(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1506 >= var5) {
									return;
								}

								this.field1506 = var5 + var5 - 1 - this.field1506;
								this.field1492 = -this.field1492;
								if (--this.numLoops == 0) {
									break label136;
								}
							}

							do {
								var9 = this.method2662(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1506 < var6) {
									return;
								}

								this.field1506 = var6 + var6 - 1 - this.field1506;
								this.field1492 = -this.field1492;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method2664(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1506 >= var5) {
									return;
								}

								this.field1506 = var5 + var5 - 1 - this.field1506;
								this.field1492 = -this.field1492;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1492 < 0) {
							while (true) {
								var9 = this.method2664(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1506 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1506) / var8;
								if (var10 >= this.numLoops) {
									this.field1506 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1506 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method2662(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1506 < var6) {
									return;
								}

								var10 = (this.field1506 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1506 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1506 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1492 < 0) {
					this.method2664(var1, var9, 0, var3, 0);
					if (this.field1506 < 0) {
						this.field1506 = -1;
						this.method2648();
						this.remove();
					}
				} else {
					this.method2662(var1, var9, var7, var3, 0);
					if (this.field1506 >= var7) {
						this.field1506 = var7;
						this.method2648();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("m")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("n")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1496 > 0) {
			if (var1 >= this.field1496) {
				if (this.field1494 == Integer.MIN_VALUE) {
					this.field1494 = 0;
					this.field1498 = 0;
					this.field1497 = 0;
					this.field1493 = 0;
					this.remove();
					var1 = this.field1496;
				}

				this.field1496 = 0;
				this.method2647();
			} else {
				this.field1493 += this.field1504 * var1;
				this.field1497 += this.field1505 * var1;
				this.field1498 += this.field1500 * var1;
				this.field1496 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field1506 < 0) {
			if (this.field1492 <= 0) {
				this.method2648();
				this.remove();
				return;
			}

			this.field1506 = 0;
		}

		if (this.field1506 >= var5) {
			if (this.field1492 >= 0) {
				this.method2648();
				this.remove();
				return;
			}

			this.field1506 = var5 - 1;
		}

		this.field1506 += this.field1492 * var1;
		if (this.numLoops < 0) {
			if (!this.field1502) {
				if (this.field1492 < 0) {
					if (this.field1506 >= var3) {
						return;
					}

					this.field1506 = var4 - 1 - (var4 - 1 - this.field1506) % var6;
				} else {
					if (this.field1506 < var4) {
						return;
					}

					this.field1506 = var3 + (this.field1506 - var3) % var6;
				}

			} else {
				if (this.field1492 < 0) {
					if (this.field1506 >= var3) {
						return;
					}

					this.field1506 = var3 + var3 - 1 - this.field1506;
					this.field1492 = -this.field1492;
				}

				while (this.field1506 >= var4) {
					this.field1506 = var4 + var4 - 1 - this.field1506;
					this.field1492 = -this.field1492;
					if (this.field1506 >= var3) {
						return;
					}

					this.field1506 = var3 + var3 - 1 - this.field1506;
					this.field1492 = -this.field1492;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1502) {
					label123: {
						if (this.field1492 < 0) {
							if (this.field1506 >= var3) {
								return;
							}

							this.field1506 = var3 + var3 - 1 - this.field1506;
							this.field1492 = -this.field1492;
							if (--this.numLoops == 0) {
								break label123;
							}
						}

						do {
							if (this.field1506 < var4) {
								return;
							}

							this.field1506 = var4 + var4 - 1 - this.field1506;
							this.field1492 = -this.field1492;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1506 >= var3) {
								return;
							}

							this.field1506 = var3 + var3 - 1 - this.field1506;
							this.field1492 = -this.field1492;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1492 < 0) {
						if (this.field1506 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1506) / var6;
						if (var7 < this.numLoops) {
							this.field1506 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1506 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1506 < var4) {
							return;
						}

						var7 = (this.field1506 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1506 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1506 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1492 < 0) {
				if (this.field1506 < 0) {
					this.field1506 = -1;
					this.method2648();
					this.remove();
				}
			} else if (this.field1506 >= var5) {
				this.field1506 = var5;
				this.method2648();
				this.remove();
			}

		}
	}

	@ObfuscatedName("d")
	public synchronized void method2641(int var1) {
		this.method2791(var1 << 6, this.method2675());
	}

	@ObfuscatedName("h")
	synchronized void method2642(int var1) {
		this.method2791(var1, this.method2675());
	}

	@ObfuscatedName("a")
	synchronized void method2791(int var1, int var2) {
		this.field1494 = var1;
		this.field1503 = var2;
		this.field1496 = 0;
		this.method2647();
	}

	@ObfuscatedName("q")
	public synchronized int method2644() {
		return this.field1494 == Integer.MIN_VALUE ? 0 : this.field1494;
	}

	@ObfuscatedName("c")
	public synchronized int method2675() {
		return this.field1503 < 0 ? -1 : this.field1503;
	}

	@ObfuscatedName("j")
	public synchronized void method2646(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1506 = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method2777() {
		this.field1492 = (this.field1492 ^ this.field1492 >> 31) + (this.field1492 >>> 31);
		this.field1492 = -this.field1492;
	}

	@ObfuscatedName("u")
	void method2648() {
		if (this.field1496 != 0) {
			if (this.field1494 == Integer.MIN_VALUE) {
				this.field1494 = 0;
			}

			this.field1496 = 0;
			this.method2647();
		}

	}

	@ObfuscatedName("p")
	public synchronized void method2744(int var1, int var2) {
		this.method2650(var1, var2, this.method2675());
	}

	@ObfuscatedName("b")
	public synchronized void method2650(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method2791(var2, var3);
		} else {
			int var4 = method2733(var2, var3);
			int var5 = method2768(var2, var3);
			if (var4 == this.field1497 && var5 == this.field1498) {
				this.field1496 = 0;
			} else {
				int var6 = var2 - this.field1493;
				if (this.field1493 - var2 > var6) {
					var6 = this.field1493 - var2;
				}

				if (var4 - this.field1497 > var6) {
					var6 = var4 - this.field1497;
				}

				if (this.field1497 - var4 > var6) {
					var6 = this.field1497 - var4;
				}

				if (var5 - this.field1498 > var6) {
					var6 = var5 - this.field1498;
				}

				if (this.field1498 - var5 > var6) {
					var6 = this.field1498 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1496 = var1;
				this.field1494 = var2;
				this.field1503 = var3;
				this.field1504 = (var2 - this.field1493) / var1;
				this.field1505 = (var4 - this.field1497) / var1;
				this.field1500 = (var5 - this.field1498) / var1;
			}
		}
	}

	@ObfuscatedName("l")
	public synchronized void method2681(int var1) {
		if (var1 == 0) {
			this.method2642(0);
			this.remove();
		} else if (this.field1497 == 0 && this.field1498 == 0) {
			this.field1496 = 0;
			this.field1494 = 0;
			this.field1493 = 0;
			this.remove();
		} else {
			int var2 = -this.field1493;
			if (this.field1493 > var2) {
				var2 = this.field1493;
			}

			if (-this.field1497 > var2) {
				var2 = -this.field1497;
			}

			if (this.field1497 > var2) {
				var2 = this.field1497;
			}

			if (-this.field1498 > var2) {
				var2 = -this.field1498;
			}

			if (this.field1498 > var2) {
				var2 = this.field1498;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1496 = var1;
			this.field1494 = Integer.MIN_VALUE;
			this.field1504 = -this.field1493 / var1;
			this.field1505 = -this.field1497 / var1;
			this.field1500 = -this.field1498 / var1;
		}
	}

	@ObfuscatedName("e")
	public synchronized void method2652(int var1) {
		if (this.field1492 < 0) {
			this.field1492 = -var1;
		} else {
			this.field1492 = var1;
		}

	}

	@ObfuscatedName("ab")
	public synchronized int method2687() {
		return this.field1492 < 0 ? -this.field1492 : this.field1492;
	}

	@ObfuscatedName("ag")
	public boolean method2654() {
		return this.field1506 < 0 || this.field1506 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ao")
	public boolean method2655() {
		return this.field1496 != 0;
	}

	@ObfuscatedName("ae")
	int method2662(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1496 > 0) {
				int var6 = var2 + this.field1496;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1496 += var2;
				if (this.field1492 == 256 && (this.field1506 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method2637(0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, this.field1505, this.field1500, 0, var6, var3, this);
					} else {
						var2 = method2672(((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, this.field1504, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method2759(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, this.field1505, this.field1500, 0, var6, var3, this, this.field1492, var5);
				} else {
					var2 = method2676(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, this.field1504, 0, var6, var3, this, this.field1492, var5);
				}

				this.field1496 -= var2;
				if (this.field1496 != 0) {
					return var2;
				}

				if (!this.method2663()) {
					continue;
				}

				return var4;
			}

			if (this.field1492 == 256 && (this.field1506 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method2685(0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, 0, var4, var3, this);
				}

				return method2722(((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method2669(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, 0, var4, var3, this, this.field1492, var5);
			}

			return method2668(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, 0, var4, var3, this, this.field1492, var5);
		}
	}

	@ObfuscatedName("ap")
	int method2664(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1496 > 0) {
				int var6 = var2 + this.field1496;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1496 += var2;
				if (this.field1492 == -256 && (this.field1506 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method2793(0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, this.field1505, this.field1500, 0, var6, var3, this);
					} else {
						var2 = method2674(((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, this.field1504, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method2679(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, this.field1505, this.field1500, 0, var6, var3, this, this.field1492, var5);
				} else {
					var2 = method2678(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, this.field1504, 0, var6, var3, this, this.field1492, var5);
				}

				this.field1496 -= var2;
				if (this.field1496 != 0) {
					return var2;
				}

				if (!this.method2663()) {
					continue;
				}

				return var4;
			}

			if (this.field1492 == -256 && (this.field1506 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method2789(0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, 0, var4, var3, this);
				}

				return method2666(((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method2734(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1497, this.field1498, 0, var4, var3, this, this.field1492, var5);
			}

			return method2753(0, 0, ((RawSound)super.sound).samples, var1, this.field1506, var2, this.field1493, 0, var4, var3, this, this.field1492, var5);
		}
	}

	@ObfuscatedName("au")
	boolean method2663() {
		int var1 = this.field1494;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method2733(var1, this.field1503);
			var3 = method2768(var1, this.field1503);
		}

		if (var1 == this.field1493 && var2 == this.field1497 && var3 == this.field1498) {
			if (this.field1494 == Integer.MIN_VALUE) {
				this.field1494 = 0;
				this.field1498 = 0;
				this.field1497 = 0;
				this.field1493 = 0;
				this.remove();
				return true;
			} else {
				this.method2647();
				return false;
			}
		} else {
			if (this.field1493 < var1) {
				this.field1504 = 1;
				this.field1496 = var1 - this.field1493;
			} else if (this.field1493 > var1) {
				this.field1504 = -1;
				this.field1496 = this.field1493 - var1;
			} else {
				this.field1504 = 0;
			}

			if (this.field1497 < var2) {
				this.field1505 = 1;
				if (this.field1496 == 0 || this.field1496 > var2 - this.field1497) {
					this.field1496 = var2 - this.field1497;
				}
			} else if (this.field1497 > var2) {
				this.field1505 = -1;
				if (this.field1496 == 0 || this.field1496 > this.field1497 - var2) {
					this.field1496 = this.field1497 - var2;
				}
			} else {
				this.field1505 = 0;
			}

			if (this.field1498 < var3) {
				this.field1500 = 1;
				if (this.field1496 == 0 || this.field1496 > var3 - this.field1498) {
					this.field1496 = var3 - this.field1498;
				}
			} else if (this.field1498 > var3) {
				this.field1500 = -1;
				if (this.field1496 == 0 || this.field1496 > this.field1498 - var3) {
					this.field1496 = this.field1498 - var3;
				}
			} else {
				this.field1500 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("aw")
	int vmethod2837() {
		int var1 = this.field1493 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1506 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("z")
	static int method2733(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("k")
	static int method2768(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lde;II)Ldm;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field1447 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lde;III)Ldm;"
	)
	public static RawPcmStream method2638(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILdm;)I"
	)
	static int method2722(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field1506 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILdm;)I"
	)
	static int method2685(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1506 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIILdm;)I"
	)
	static int method2666(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field1506 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIILdm;)I"
	)
	static int method2789(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field1506 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILdm;II)I"
	)
	static int method2668(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1506 = var4;
		return var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdm;II)I"
	)
	static int method2669(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1506 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIILdm;II)I"
	)
	static int method2753(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1506 = var4;
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdm;II)I"
	)
	static int method2734(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1506 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILdm;)I"
	)
	static int method2672(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1497 += var9.field1505 * (var6 - var3);
		var9.field1498 += var9.field1500 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field1493 = var4 >> 2;
		var9.field1506 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILdm;)I"
	)
	static int method2637(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1493 += var12.field1504 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field1497 = var5 >> 2;
		var12.field1498 = var6 >> 2;
		var12.field1506 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "([B[IIIIIIIILdm;)I"
	)
	static int method2674(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1497 += var9.field1505 * (var6 - var3);
		var9.field1498 += var9.field1500 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field1493 = var4 >> 2;
		var9.field1506 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		signature = "(I[B[IIIIIIIIIILdm;)I"
	)
	static int method2793(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1493 += var12.field1504 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field1497 = var5 >> 2;
		var12.field1498 = var6 >> 2;
		var12.field1506 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdm;II)I"
	)
	static int method2676(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1497 -= var11.field1505 * var5;
		var11.field1498 -= var11.field1500 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1497 += var11.field1505 * var5;
		var11.field1498 += var11.field1500 * var5;
		var11.field1493 = var6;
		var11.field1506 = var4;
		return var5;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILdm;II)I"
	)
	static int method2759(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1493 -= var5 * var13.field1504;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1493 += var13.field1504 * var5;
		var13.field1497 = var6;
		var13.field1498 = var7;
		var13.field1506 = var4;
		return var5;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIILdm;II)I"
	)
	static int method2678(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1497 -= var11.field1505 * var5;
		var11.field1498 -= var11.field1500 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1497 += var11.field1505 * var5;
		var11.field1498 += var11.field1500 * var5;
		var11.field1493 = var6;
		var11.field1506 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "(II[B[IIIIIIIIIILdm;II)I"
	)
	static int method2679(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1493 -= var5 * var13.field1504;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1493 += var13.field1504 * var5;
		var13.field1497 = var6;
		var13.field1498 = var7;
		var13.field1506 = var4;
		return var5;
	}
}
